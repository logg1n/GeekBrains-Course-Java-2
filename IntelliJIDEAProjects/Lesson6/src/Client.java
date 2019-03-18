import java.io.*;
import java.net.Socket;

public abstract class Client {
    private static int PORT = 4040;
    public String nickname;
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;
    private BufferedReader reader;

    public static int getPORT() {
        return PORT;
    }

    public static void setPORT(int PORT) {
        Client.PORT = PORT;
    }

    public void init() throws IOException {
        input = new DataInputStream (socket.getInputStream ( ));
        output = new DataOutputStream (socket.getOutputStream ( ));
        reader = new BufferedReader (new InputStreamReader (System.in));

        Thread in = new Thread (() -> {
            while (true) {
                try {
                    String string = input.readUTF ( );
                    System.out.println (string);
                } catch (IOException ex) {
                    closed ( );
                    System.out.println ("Error print");
                    break;
                }
            }
        });

        Thread out = new Thread (() -> {
            while (true) {
                try {
                    String string = reader.readLine ( );
                    output.writeUTF (nickname + ": " + string);
                    output.flush ( );
                }catch (IOException ex1) {
                    closed ( );
                    System.out.println ("Error send");
                    break;
                }
            }
        });
        try {
            in.start ( );
            out.start ( );
            in.join ( );
            out.join ( );
        } catch (InterruptedException inex) {
            closed ( );
        }
        closed ( );
    }

    public void closed() {
        try {
            input.close ( );
            output.close ( );
            reader.close ( );
            socket.close ( );
            System.exit (0);
        } catch (IOException ex) {
            System.exit (-1);
        }
    }

    protected void setSocket(Socket socket) {
        this.socket = socket;
    }

    public abstract void start() throws IOException;
}


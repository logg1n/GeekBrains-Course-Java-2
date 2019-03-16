import java.io.*;
import java.net.Socket;

public abstract class User {
    private static int PORT = 4040;
    private  Socket socket;
    private DataInputStream input;
    private DataOutputStream output;
    private BufferedReader reader;
    private Thread in;
    private Thread out;

    public void init() throws IOException {
        input = new DataInputStream (socket.getInputStream ( ));
        output = new DataOutputStream (socket.getOutputStream ( ));
        reader = new BufferedReader (new InputStreamReader (System.in));
        in = new Thread (() -> {
            listenInput ( );
        });
        out = new Thread (() -> {
            listenOutput ( );
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

    public static int getPORT() {
        return PORT;
    }

    public static void setPORT(int PORT) {
        User.PORT = PORT;
    }

    private void listenOutput() {
        while (true) {
            try {
                System.out.print ("-> ");
                String string = reader.readLine ( );
                output.writeUTF (string);
                output.flush ( );
            } catch (IOException ex) {
                System.out.println ("Error send");
            }
        }
    }

    private void listenInput() {
        while (true) {
            try {
                String string = input.readUTF ( );
                System.out.println ("\r<-" + string);
            } catch (IOException ex) {
                System.out.println ("Error print");
            }
        }
    }

    public void closed() {
        try {
            input.close ( );
            output.close ( );
            reader.close ( );
            socket.close ( );
        } catch (IOException ex) {
            System.exit (-1);
        }
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public abstract void start() throws IOException;
}

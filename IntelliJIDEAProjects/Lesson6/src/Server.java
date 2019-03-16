import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends User{
    private static ServerSocket server;
    private static Socket socket;

    @Override
    public void start( ) throws IOException {
        server = new ServerSocket (4040);
        if (!server.isClosed ( )) {
            System.out.println ("Server started ...");
            socket = server.accept ( );
            System.out.println ("user connected ...");
            setSocket (socket);
            init ( );
        } else {
            closed ( );
        }
    }

    public static void main(String[] args) throws IOException{
        Server server = new Server ( );
        server.start ( );
    }
}

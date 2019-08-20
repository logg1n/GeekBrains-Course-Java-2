import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends User {
    public static void main(String[] args) throws IOException {
        Server server = new Server ( );
        server.start ( );
    }

    @Override
    public void start() throws IOException {
        nickname = "Server";
        ServerSocket server = new ServerSocket (getPORT ( ));
        if (!server.isClosed ( )) {
            System.out.println ("Server started ...");
            Socket socket = server.accept ( );
            System.out.println ("User connected ...");
            setSocket (socket);
            init ( );
        } else {
            closed ( );
        }
    }
}
import java.io.IOException;
import java.net.Socket;

public class User extends Client {
    public static void main(String[] args) throws IOException {
        User client = new User ( );
        client.start ( );
    }

    @Override
    public void start() throws IOException {
        nickname = "User";
        Socket socket = new Socket ("localhost", getPORT ( ));
        if (socket.isConnected ( )) {
            System.out.println ("Connection successful ...");
            setSocket (socket);
            init ( );
        } else {
            System.out.println ("Server not working ...");
            closed ( );
        }
    }
}

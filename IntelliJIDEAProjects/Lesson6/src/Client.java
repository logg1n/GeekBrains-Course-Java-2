import java.io.IOException;
import java.net.Socket;

public class Client extends User {
 
    @Override
    public void start() throws IOException {
        Socket socket = new Socket ("localhost", getPORT ( ));
        if (socket.isConnected ( )) {
            System.out.println ("Client connected");
            setSocket (socket);
            init ( );
        }
        else{
            closed ();
        }
    }

    public static void main(String[] args) throws IOException{
        Client client = new Client ();
        client.start ();
    }
}

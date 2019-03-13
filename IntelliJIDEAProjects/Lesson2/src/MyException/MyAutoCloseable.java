package MyException;

public class MyAutoCloseable implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Close");
        System.exit(0);
    }
}

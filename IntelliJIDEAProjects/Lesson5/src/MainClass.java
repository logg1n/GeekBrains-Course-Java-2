import java.util.Arrays;

public class MainClass {
    private static long time;

    public static void main(String[] args) throws InterruptedException{
        float[] array = new ArrayGenerator ().giveArray (1);
        float[] arrayThread = new ArrayGenerator ().giveArray (1);

        time = System.currentTimeMillis ( );
        ArrayHundler.runArray (array,0);
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds no thread: " + time);


        time = System.currentTimeMillis ( );
        ArrayHundler.runArrayThread (arrayThread);
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds thread: " + time);

        if (Arrays.equals (arrayThread, array))
            System.out.println ("Equals!" );
        else
            System.out.println ("No Equals!" );
   }

}


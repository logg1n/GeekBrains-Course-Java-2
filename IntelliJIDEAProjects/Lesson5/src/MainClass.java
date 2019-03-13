import java.util.Arrays;

public class MainClass {
    static final int size = 10000000;
    static long time;

    public static void main(String[] args) {
        float[] array = new ArrayGenerator ().giveArray (1);
        float[] arrayThread = new ArrayGenerator ().giveArray (1);

        time = System.currentTimeMillis ( );
        ArrayHundler.runArray (array);
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds no thread: " + time);


        time = System.currentTimeMillis ( );
/*
        a1 = new float[arrayThread.length / 2];
        a2 = new float[arrayThread.length / 2];

        System.arraycopy (arrayThread, 0, a1, 0, a1.length);
        System.arraycopy (arrayThread, a1.length, a2, 0, a2.length);

        ArrayHundler.runArrayThread (a1);
        ArrayHundler.runArrayThread (a2);
        */
        ArrayHundler.runArrayThread (arrayThread);
/*
        System.arraycopy (a1, 0, arrayThread, 0, a1.length);

          System.arraycopy (a2, 0, arrayThread, a1.length, a2.length);
    */
        time = System.currentTimeMillis ( ) - time;

        System.out.println ("milliseconds thread: " + time);

        for (int i = 0; i < 10; i++)
            System.out.println (array[i] + " : " + arrayThread[i]);

        if (Arrays.equals (array, arrayThread))
            System.out.println ("OK" );

        else System.out.println ("NO" );

    }

}


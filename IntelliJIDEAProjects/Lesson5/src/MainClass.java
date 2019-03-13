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
        ArrayHundler.runArrayThread (arrayThread);
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds thread: " + time);

        for (int i = 0; i < 10; i++) {
            if (array[i] != arrayThread[i])
                System.out.printf ("%d != %d index [%d]\n", array[i], arrayThread[i], i);
        }
   }

}


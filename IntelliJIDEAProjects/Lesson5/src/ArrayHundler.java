public class ArrayHundler {
    static float[] a1;
    static float[] a2;

    public static void runArrayThread(float[] array) throws InterruptedException{
        Thread thread1 = new Thread (() -> {
            a1 = new float[array.length / 2];
            System.arraycopy (array, 0, a1, 0, a1.length);
            runArray (a1, 0);
            System.arraycopy (a1, 0, array, 0, a1.length);
        });

        Thread thread2 = new Thread (() ->{
            a2 = new float[array.length / 2];
            System.arraycopy (array, a1.length, a2, 0, a2.length);
            runArray (a2, a2.length);
            System.arraycopy (a2, 0, array, a1.length, a2.length);
        });

        thread1.start ();
        thread1.join ();
        thread2.start ();
        thread2.join ();
    }

    public static void runArray(float[] arrays, int val) {
        for (int i = 0; i < arrays.length; i++, val++) {
            arrays[i] = (float) (arrays[i] * Math.sin (0.2f + val / 5) * Math.cos (0.2f + val / 5) * Math.cos (0.4f + val / 2));
        }
    }
}

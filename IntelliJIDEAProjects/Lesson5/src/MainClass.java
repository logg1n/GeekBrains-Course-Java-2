public class MainClass {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static long time;

    static class MyThread extends Thread {
        float[] a;

        public MyThread(float[] a) {
            this.a = a;
        }

        @Override
        public void run() {
            runArray (a);
            return;
        }
    }

    public static void main(String[] args) {
    
        initArr ( );
        time = System.currentTimeMillis ( );
        runArray (arr);
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds no thread: " + time);

        initArr ( );
        time = System.currentTimeMillis ( );
        runArrayThread ( );
        time = System.currentTimeMillis ( ) - time;
        System.out.println ("milliseconds thread: " + time);


    }

    static void initArr() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    private static void runArray(float[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float) (a[i] * Math.sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math.cos (0.4f + i / 2));
        }
    }

    private static void runArrayThread() {
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy (arr, 0, a1, 0, a1.length);
        System.arraycopy (arr, a1.length, a2, 0, a2.length);

        new MyThread (a1).start ( );
        new MyThread (a2).start ( );

        System.arraycopy (a1, 0, arr, 0, a1.length);
        System.arraycopy (a2, 0, arr, a1.length, a2.length);
    }

}


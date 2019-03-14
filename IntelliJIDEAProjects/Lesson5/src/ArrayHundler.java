public class ArrayHundler {
    static  float[] a1;
    static  float[] a2;

    public static void runArrayThread(float[] array){

        a1 = new float[array.length / 2];
        a2 = new float[a1.length];

        System.arraycopy (array, 0, a1, 0, a1.length);
        System.arraycopy (array, a1.length, a2, 0, a2.length);

        new Thread (() -> runArray (a1)).start ();
        new Thread (() -> runArray (a2)).start ();

        System.arraycopy (a1, 0, array, 0, a1.length);
        System.arraycopy (a2, 0, array, a1.length, a2.length);
     }

    public static void runArray(float[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (float) (arrays[i] * Math.sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math.cos (0.4f + i / 2));
        }
    }
}

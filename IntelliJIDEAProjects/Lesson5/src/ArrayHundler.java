public class ArrayHundler {
    public static void runArrayThread(float[] array){
        float[] a1 = new float[array.length / 2];
        float[] a2 = new float[array.length / 2];

        System.arraycopy (array, 0, a1, 0, a1.length);
        System.arraycopy (array, a1.length, a2, 0, a2.length);

        new Thread (() -> runArrayThread (a1));
        new Thread (() -> runArrayThread (a2));
     }

    public static void runArray(float[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (float) (arrays[i] * Math.sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math.cos (0.4f + i / 2));
        }
    }
}

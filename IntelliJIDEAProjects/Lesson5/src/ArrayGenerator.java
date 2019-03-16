import java.util.Arrays;

public class ArrayGenerator  {
    private static final int SIZE = 10000000;

    public float[] giveArray(int init){
        float[] arr = new float[SIZE];
        Arrays.fill ( arr,init);

        return arr;
    }
}

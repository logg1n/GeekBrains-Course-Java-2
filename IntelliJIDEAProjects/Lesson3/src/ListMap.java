import java.util.*;

public class ListMap<T> {
    private List<T> listOne;
    private List<Integer> listTwo;
    private int size;
    private boolean reorg;

    public <T> ListMap() {
        listOne = new ArrayList<> ( );
        listTwo = new ArrayList<> ( );
    }

    public void inArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add ((T) arr[i]);
        }
        reorganization ( );
    }

    public boolean add(T t) {
        if (listOne.add (t) && listTwo.add (1)) {
            ++size;
            return true;
        }
        return false;
    }


    private void reorganization() {
        for (int i = 0; i < size; i++) {
            int count = Collections.frequency (listOne, listOne.get (i));
            listTwo.set (i, count);
        }

        reorg = true;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.printf ("Word: %s :\n\t replace: %d\n", listOne.get (i), listTwo.get (i));
        }
    }

    public void printlnUnique() {
        if (!reorg) {
            System.out.println ("Sorry, not reorganization List");
            return;
        }

        System.out.println ("Unique Words: ");
        for (int i = 0; i < size; i++) {
            if (listTwo.get (i) == (1)) {
                System.out.printf ("\t%s\n", listOne.get (i));
            }
        }
    }
}
package nodelist;

public class NodeList<E> implements NodeListI {
    private static NodeList Head;
    private static int size = 0;
    private NodeList Next;
    private NodeList node;
    private E val;

    public NodeList() {
        if (Head == null) {
            Head = this;
            node = this;
        }
    }

    @Override
    public void add(Object o) {
        node.val = (E) o;
        node.Next = new NodeList ( );
        node = node.Next;
        ++size;
    }

    public void printRev() {
        Object[] obj = new Object[size];
        NodeList t = Head;
        int i = 0;
        while (t != null) {
            if (t.Next == null)
                break;
            obj[i++] = t.val;
            t = t.Next;
        }
        reverseArr (obj);
        for (Object o : obj) {
            System.out.printf ("%s ",o);
        }
        System.out.println ( );

    }

    private void reverseArr(Object[] obj) {
        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = 0; j < obj.length - i - 1; j++) {
                Object o;
                o = obj[j];
                obj[j] = obj[j + 1];
                obj[j + 1] = o;
            }
        }
    }

    @Override
    public void reverse() {
/*
        NodeList head = Head;
        NodeList next = head.Next;

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size - j; j++) {
                if (head.Next == null || head == null) {
                    break;
                }

            }
        }
  */
    }

    public void printList() {
        NodeList t = Head;
        while (t != null) {
            if (t.Next == null)
                break;
            System.out.print (t.val + " ");
            t = t.Next;
        }
        System.out.println ( );
    }

    public int size() {
        return size;
    }
}
import multimap.MultiMap;
import nodelist.NodeList;
import phonebook.PhoneBook;

public class MainClass {

    public static void main(String[] args) {
        String[] stringArr = {"out", "still", "then", "there", "together", "well", "almost", "out",
                "enough", "even", "little", "much", "not", "only", "quite", "not", "very", "tomorrow",
                "out", "yesterday", "north", "then", "south", "east", "west", "please", "yes"};

        ListMap<?> listMap = new ListMap<> ( );
        listMap.inArray (stringArr);
        //listMap.print ( );
        //listMap.printlnUnique();

        /* _____________________________________________________________________ */

        int i = 0;

        PhoneBook phoneBook = new PhoneBook ( );
        while (i++ < 10) {
            phoneBook.add ("name" + i, 22024L + i);
        }
        phoneBook.add ("name" + 3, 22024L + 25);
        phoneBook.add ("name" + 3, 22024L + 49);

        //phoneBook.get ("name3");
        //phoneBook.printPhoneBook ();

        /* _____________________________________________________________________ */

        MultiMap<Integer, Integer, String> miltiMap = new MultiMap<> ( );
        miltiMap.put (1, 1, "string1");
        miltiMap.put (2, 2, "string2");
        miltiMap.put (3, 1, "string3");
    /*
        for (int inth = 1; inth <= miltiMap.size ( ); inth++) {
            System.out.printf ("value: %s\n", miltiMap.getValueK(1 ));
        }
     */
        //    System.out.println (miltiMap.size () );
/*
        for (Object o : miltiMap.getValueT (1))
            System.out.println (o );
 */
        /* _____________________________________________________________________ */

        NodeList<Integer> node = new NodeList<> ( );
        int integer = 0;
        for (; integer < 25; integer++) {
            node.add (integer);
        }

//        node.printList ( );
 //    node.printRev ();
        //    System.out.println (node.size ( ) );
    }
}
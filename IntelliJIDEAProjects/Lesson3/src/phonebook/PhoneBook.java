package phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<Long, String> pb;

    public PhoneBook() {
        pb = new TreeMap<> ();
    }

    public boolean add(String name, Long phone){
        if (pb.put (phone, name) != null)
            return true;
        return false;
    }

    public Long get(String name){
        for (Map.Entry<Long, String> entry : pb.entrySet ()){
            if (entry.getValue ().equals (name))
                System.out.printf ("Name: %s | Phone: %d\n", name, entry.getKey ());
        }
        return -1L;
    }

    public void printPhoneBook(){
        for (Map.Entry<Long, String> entry : pb.entrySet ()){
            System.out.printf ("Name: %s | Phone: %d\n",entry.getValue (), entry.getKey ());
        }
    }
}
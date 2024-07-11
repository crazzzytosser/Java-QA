package HW3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StreamComparator implements Comparator<Groups> {


    @Override
    public int compare(Groups o1, Groups o2) {
        int result = o1.getGroupNumber().compareTo(o2.getGroupNumber());
        if (result == 0) {
            return o1.getGroupNumber().compareTo(o2.getGroupNumber());
        } else {
            return result;
        }
    }
}

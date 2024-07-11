package HW3;

import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<Groups> {

   private List<Groups> groupsList;


    public List<Groups> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Groups> groupsList) {
        this.groupsList = groupsList;
    }

    @Override
    public Iterator<Groups> iterator() {
        return null;
    }

}
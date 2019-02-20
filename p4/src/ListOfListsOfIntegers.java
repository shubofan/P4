import java.util.ArrayList;
import java.util.List;

public class ListOfListsOfIntegers {
    private List<List<Integer>> listOflists;

    public ListOfListsOfIntegers() {
        this.listOflists = new ArrayList<>();
    }

    public Integer size() {
        return listOflists.size();
    }

    public Boolean isEmpty() {
        return listOflists.isEmpty();
    }

    public void add(List<Integer> l) {
        listOflists.add(l);
    }

    public Integer length() {
        int length = 0;
        for (List<Integer> l: listOflists) {
            length += l.size();
        }
        return length;
    }

    public void removeInteger(Integer e) {
        for (List<Integer> l: listOflists) {
            for (Integer i: l) {
                if (i == e) {
                    l.remove(e);
                    return;
                }
            }
        }
    }

    public void removeAllInteger(Integer e) {
        for (List<Integer> l: listOflists) {
            for (Integer i: l) {
                if (i == e) {
                    l.remove(e);
                }
            }
        }
    }

}

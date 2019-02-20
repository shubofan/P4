import java.util.HashSet;
import java.util.Set;

public class aSet implements Sets{

    private java.util.Set<Integer> s;


    public aSet(java.util.Set<Integer> i) {
        this.s = i;
    }

    @Override
    public Boolean isEmpty() {
        return false;
    }

    @Override
    public Sets add(Integer n) {
        if (this.contains(n)) {
            return this;
        } else {
            s.add(n);
            return new aSet(s);
        }
    }

    @Override
    public Boolean contains(Integer n) {
        return s.contains(n);
    }

    @Override
    public Sets remove(Integer n) {
        if (s.contains(n)) {
            s.remove(n);
        }
        return new aSet(new HashSet<>(s));
    }

    @Override
    public Integer size() {
        return s.size();
    }
}

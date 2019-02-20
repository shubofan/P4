import java.util.HashSet;

public class EmptySet implements Sets{

    @Override
    public Boolean isEmpty() {
        return true;
    }

    @Override
    public Sets add(Integer n) {
        return new aSet(new HashSet<>(n));
    }

    @Override
    public Boolean contains(Integer n) {
        return false;
    }

    @Override
    public Sets remove(Integer n) {
        return this;
    }

    @Override
    public Integer size() {
        return 0;
    }
}

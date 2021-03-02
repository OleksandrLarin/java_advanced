package lecture7.generics.practic;

import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public T get(int index) {
        return list.get(index);
    }

    public void add(T value) {
        list.add(value);
    }
}

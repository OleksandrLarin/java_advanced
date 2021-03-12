package lesson9.oop.incapsulation;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<String> stringList = new ArrayList<>();

    public void addString(String string) {
        if (string != null && string.length() > 0) {
            stringList.add(string);
        }
    }

    public List<String> getStringList() {
        return new ArrayList<>(stringList);
    }

    public void clear() {
        stringList.clear();
    }
}

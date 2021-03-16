package lesson11.internetMarket.dao;

import java.util.List;

public interface Dao<T> {
    T findById(int id);

    List<T> findAll();

    void create(T model);

    void update(T model);

    void deleteById(int id);
}

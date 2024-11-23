package db;

import java.util.List;

public interface IDatabase<T> {
    void addToy(T toy);
    List<T> getAllToys();
    void deleteToy(String toyId);
}
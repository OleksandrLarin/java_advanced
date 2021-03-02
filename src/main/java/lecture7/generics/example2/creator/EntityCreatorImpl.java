package lecture7.generics.example2.creator;

public abstract class EntityCreatorImpl<T> implements Creator<T, Integer, String> {
    @Override
    public abstract T apply(Integer id, String name);
}

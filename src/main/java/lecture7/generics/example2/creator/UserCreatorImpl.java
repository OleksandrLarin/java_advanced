package lecture7.generics.example2.creator;

import lecture7.generics.example2.model.Product;
import lecture7.generics.example2.model.User;

public class UserCreatorImpl extends EntityCreatorImpl<User> {
    @Override
    public User apply(Integer id, String name) {
        return new User(id, name);
    }
}

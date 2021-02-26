package lecture5.mocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ManagerTest {

    public static final String NAME = "Jack";
    private Manager manager;

    @Test
    public void shouldCreateNewUser() {
        List<User> users = Mockito.mock(List.class);
        manager = new Manager(users);

        manager.createUserByName(NAME);

        verify(users).add(any());
    }

    @Test
    public void shouldFindUserByName() {
        User jack = new User();
        jack.setName(NAME);
        ArrayList<User> userList = new ArrayList<>();
        userList.add(jack);
        List<User> users = Mockito.spy(userList);
        manager = new Manager(users);

        User actual = manager.findByName(NAME);

        assertEquals(NAME, actual.getName());
    }

    @Test
    public void shouldCreateNewUserWithTimestamp() {
        List<User> users = Mockito.mock(List.class);
        manager = new Manager(users);
        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        final long millis = System.currentTimeMillis();

        manager.createUserByName(NAME);
        manager.createUserByName("NAME");

        verify(users, times(2)).add(captor.capture());
        assertTrue(captor.getValue().getTimestamp() >= millis);
    }
}

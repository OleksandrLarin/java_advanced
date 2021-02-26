package lecture5.mocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    public static final String DUMMY = "";

    @Test
    public void shouldBeInvokedMethodAdd() {
        //Given
        List<String> list = mock(List.class);
        //When
        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);
        //Then
        verify(list, atLeast(2)).add(DUMMY);
        assertEquals(4, list.size());
    }

    @Test
    public void shouldNotBeInvokedMethodClear() {
        //Given
        List<String> list = mock(List.class);
        //When
        list.add(DUMMY);
        list.add(DUMMY);
        //Then
        verify(list, never()).clear();
    }

    @Test
    public void shouldReturnNumberWhenSizeInvoked() {
        List<String> list = mock(List.class);

        doReturn(1).when(list).size();

        assertEquals(1, list.size());
    }

    @Test
    public void spyTest() {
        List<String> list = Mockito.spy(new ArrayList<>());

        list.add("one");
        list.add("two");

        verify(list, times(2)).add(anyString());
        assertEquals(2, list.size());
    }
}

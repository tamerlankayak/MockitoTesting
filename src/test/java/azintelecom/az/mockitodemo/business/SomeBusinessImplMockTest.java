package azintelecom.az.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findGreatestFromAllData_basicScenario() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});

        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }


    @Test
    void findGreatestFromAllData_OneValue() {

//        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});

//        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);

        assertEquals(35, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findGreatestFromAllData_EmptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}

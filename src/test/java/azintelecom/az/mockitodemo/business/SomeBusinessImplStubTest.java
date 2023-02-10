package azintelecom.az.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    void findGreatestFromAllData_basicScenario() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = someBusinessImpl.findTheGreatestFromAllData();

        assertEquals(25, result);
    }



}
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
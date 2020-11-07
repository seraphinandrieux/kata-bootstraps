package globalDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassUnitTest {

    @Test
    void shouldReturnValue(){
        TestClass test =new TestClass(true);
        assertEquals(test.getIsHere(),true);
    }
}
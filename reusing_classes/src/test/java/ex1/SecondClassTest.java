package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondClassTest {

    @Test
    void checkLazyInitialization () {
        SecondClass secondClass = new SecondClass();
        secondClass.print();
    }
}
package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoapTest {

    @Test
    void checkSoap() {

        Soap soap = new Soap();
        soap.scrub();
        soap.sterilize();
        System.out.println(soap.toString());
    }
}
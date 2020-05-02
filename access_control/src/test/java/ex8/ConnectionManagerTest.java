package ex8;

import org.junit.jupiter.api.Test;

class ConnectionManagerTest {

    @Test
    void checkEx8() {
        int howManyLeft = 3;

        ConnectionManager connectionManager = new ConnectionManager();
        System.out.println("total connection remaining: " + ConnectionManager.howManyLeft);

        ConnectionManager.getConnection();
        System.out.println("total connection remaining: " + ConnectionManager.howManyLeft);

        ConnectionManager.getConnection();
        System.out.println("total connection remaining: " + ConnectionManager.howManyLeft);

        ConnectionManager.getConnection();
        System.out.println("total connection remaining: " + ConnectionManager.howManyLeft);

        ConnectionManager.getConnection();
    }
}
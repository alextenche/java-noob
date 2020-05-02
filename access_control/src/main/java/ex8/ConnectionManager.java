package ex8;

public class ConnectionManager {

    static int howManyLeft = 3;
    static Connection[] connections = new Connection[3];

    public ConnectionManager() {
        for (Connection connection : connections) {
            connection = Connection.makeConnection();
        }
    }

    public static Connection getConnection() {
        if (howManyLeft > 0)
            return connections[--howManyLeft];
        else {
            System.out.println("no more connections");
            return null;
        }
    }

}

package ex8;

public class Connection {

    private static int count = 0;
    private int i = 0;

    private Connection(int i) {
        this.i = i;
        System.out.println("creating connection " + this.i);
    }

    public static Connection makeConnection() {
        count += 1;

        return new Connection(count);
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }

}

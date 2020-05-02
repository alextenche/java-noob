package ex1;

public class SecondClass {

    private FirstClass firstClass;

    public void print() {
        if (firstClass == null) {
            System.out.println("lazy instance of first class");
            firstClass = new FirstClass();
        }

    }
}

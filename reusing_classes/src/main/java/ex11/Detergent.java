package ex11;

public class Detergent {

    private Cleanser cleanser = new Cleanser();

    public void append(String text) {
        cleanser.append(text);
    }

    public void scrub() {
        append(" Detergent.scrub()");
        cleanser.scrub(); // Call base-class version
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void foam() {
        append(" foam()");
    }

    public String toString(){
        return cleanser.toString();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

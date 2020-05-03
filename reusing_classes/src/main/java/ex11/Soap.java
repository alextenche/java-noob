package ex11;

public class Soap extends Detergent {

    public void scrub() {
        append("Soap.scrub()");
        super.scrub(); // Call base-class version
    }

    public void sterilize() {
        append("Soap.sterilize()");
    }



}

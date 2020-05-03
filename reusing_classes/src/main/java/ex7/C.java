package ex7;

import ex7.A;
import ex7.B;

public class C extends A {

    B b;

    public C(String x) {
        super(x);
        b = new B(x);
    }
}

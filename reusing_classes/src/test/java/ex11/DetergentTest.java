package ex11;

import org.junit.jupiter.api.Test;


class DetergentTest {

    @Test
    void ex11() {

        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
    }
}
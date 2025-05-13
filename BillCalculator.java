abstract class Plan {
    abstract double getRate();

    void calculateBill(int units) {
        System.out.println("Bill: ₹" + (units * getRate()));
    }
}

class Domestic extends Plan {
    double getRate() {
        return 3.5;
    }
}

class Commercial extends Plan {
    double getRate() {
        return 7.0;
    }
}

public class BillCalculator {
    public static void main(String[] args) {
        Plan p;

        p = new Domestic();
        p.calculateBill(100);

        p = new Commercial();
        p.calculateBill(100);
    }
}

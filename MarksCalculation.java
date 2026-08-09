class MarksCalculation {
    int m1, m2, m3, m4, m5;

    void calculate() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {
        MarksCalculation s = new MarksCalculation();

        s.m1 = 80;
        s.m2 = 90;
        s.m3 = 85;
        s.m4 = 90;
        s.m5 = 85;

        s.calculate();
    }00
000000000}
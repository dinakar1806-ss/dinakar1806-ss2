class RectangleArea {
    double length;
    double breadth;
    double area;

    void area() {
         area = length * breadth;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args)
     {
        RectangleArea r = new RectangleArea();

        r.length = 10;
        r.breadth = 5;

        r.area();
    }
}
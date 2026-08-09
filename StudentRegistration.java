class StudentRegistration {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        StudentRegistration s = new StudentRegistration();

        s.name = "DinakarSS";
        s.rollNo = 62;

        s.display();
    }
}
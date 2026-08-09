class DetailsStudent {

    String name;
    int age;

    
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
        System.out.println();
    }
}

public class NameAge {

    public static void main(String[] args) {

        
        DetailsStudent s1 = new DetailsStudent();
        s1.name = "Rahul";
        s1.age = 19;

        
        DetailsStudent s2 = new DetailsStudent();
        s2.name = "Priya";
        s2.age = 20;

        
        s1.display();
        s2.display();
    }
}
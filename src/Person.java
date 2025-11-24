
public class Person {
    String name;
    String dob;
    String address;

    Person(String n, String d, String add) {
        name = n;
        dob = d;
        address = add;
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("DOB     : " + dob);
        System.out.println("Address : " + address);
    }
}


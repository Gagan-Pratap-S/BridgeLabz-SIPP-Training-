package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;




public class PersonCopyConstructor {
    String name;
    int age;

    public PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonCopyConstructor(PersonCopyConstructor p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        PersonCopyConstructor p1 = new PersonCopyConstructor("John", 25);
        PersonCopyConstructor p2 = new PersonCopyConstructor(p1);
        p1.display();
        p2.display();
    }
}
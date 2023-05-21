
class Student {
    String name,
            city;
    int age;

    void printData() {
        System.out.println("Student name = " + name);
        System.out.println("Student city = " + city);
        System.out.println("Student age = " + age);
    }
}

class Stest {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Amit";
        s1.city = "Dehradun";
        s1.age = 22;
        s2.name = "Kapil";
        s2.city = "Delhi";
        s2.age = 23;
        s2.printData();
        s1.printData();
        
    }
}

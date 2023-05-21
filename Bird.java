class Bird {
    int age;
    String name;

    Bird() {
        name = "parrot";
        System.out.println("This is the " + name);
    }

    Bird(String x) {
        name = x;
        System.out.println("This is the " + name);
    }

    Bird(int y, String z) {
        age = y; 
        name = z;
        System.out.println("This is the " + age + " year old " + name);
    }

    public static void main(String arr[]) {
        Bird a = new Bird();
        Bird b = new Bird("maina");
        Bird c = new Bird(20, "sparrow");
    }
}

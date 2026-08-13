
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;  // this keyword refers to class instance variables and this keyword is used to avoid Shawdowing Effect(Eg:name=name)
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

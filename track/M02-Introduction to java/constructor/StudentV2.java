
class Studentv2 {

    String name;
    int age;
    double height;

    Studentv2() {
        this.name = "teja";
        this.age = 20;
        this.height = 5.6;
    }

    Studentv2(String name) {
        this.name = name;
    }

    Studentv2(String name, int age, double height) {//
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}


class EmpApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 15;
        e1.name = "GV";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2;

        e2 = e1; // reference assignment 

        e2.id = 2815;
        e2.name = "VG";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }
}

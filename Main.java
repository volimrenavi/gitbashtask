public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
		Person p1 = new Person("Voronov", "Evgeniy");
        Person p2 = new Person("Belova", "Valeria");
=======
		Person p1 = new Person("Lebedev", "Egor");
		Person p2 = new Person("Belova", "Valeria");
>>>>>>> feature1
        Person p3 = new Person("Ivanov", "Mark");
        Company c1 = new Company("Roga&Kopyta");
        c1.setBoss(p3);
        c1.addEmployee(p1);
        c1.addEmployee(p2);
    }
}

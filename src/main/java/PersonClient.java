public class PersonClient {
    public static void main(String[] args) {
        Person account = new Person("savonnah", "wong");

        System.out.println("Person's first name is: " + account.getFirstName());
        System.out.println("Person's last name is: " + account.getLastName());


        account.setFirstName("jane");
        account.setLastName("doe");
        System.out.println("Person's first name is: " + account.getFirstName());
        System.out.println("Person's last name is: " + account.getLastName());

        System.out.println(account);

        // STUDENT JAVA:
        System.out.println();
        System.out.println("Student test:");
        Student s1 = new Student("savonnah", "wong", 2023);
        s1.doSomething();
        s1.getClassYear();
        s1.setClassYear(2022);
        s1.getClassYear();
        s1.getFirstName();
        s1.getLastName();
        System.out.println(s1);

        // Ninth Grader JAVA:
        System.out.println();
        System.out.println("Ninth Grader test:");
        NinthGrader n1 = new NinthGrader("savonnah", "wong", 2023);
        n1.doSomething();
        n1.getClassYear();
        n1.setClassYear(2022);
        n1.getClassYear();
        n1.getFirstName();
        n1.getLastName();
        System.out.println(n1);


    }
}

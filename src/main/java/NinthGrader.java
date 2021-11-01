public class NinthGrader extends Student {
        // Instance variables:
        // firstName and lastName are already inherited
        private int classYear;//what need to be added;

        // Constructors
        // A constructor that takes three parameters for the
        // firstName, lastName, and classYear
        public NinthGrader(String a, String b, int c) {
            super(a, b);
            c = 2025;
            this.classYear = c;
        }
/*
        // A constructor that assumes that a default student is a ninth-grader
        public Student(String a, String b) {
            super(a, b);
            this.classYear = 2025;
        }

        // A default/no-argument constructor
        public Student() {
            super("Jerry", "Seinfeld");
            this.classYear = 2024;
        }
*/
        // doSomething() method
        //Method overriding: child class's code replaces the parent class's code
        @Override
        public void doSomething() {
            System.out.println("I am preparing for a Harkness discussion!");
        }

        // toString()
        @Override
        public String toString() {
            String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear + " (Ninth Grader)";
            return str;
        }

/*
        // Getters
        // We've already inherited getFirstName() and getLastName()
        // so we only need to add getClassYear
        public int getClassYear() {
            return this.classYear;
        }

        // Setters
        public void setClassYear(int classYear) {
            this.classYear = classYear;
        }

 */
}




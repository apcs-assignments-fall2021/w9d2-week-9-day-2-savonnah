public class Person {
    // Instance variables
    private String firstname;
    private String lastname;


    //Constructor
    public Person (String f, String l){
        firstname = f;
        lastname = l;
    }

    //Getter
    public void doSomething() { System.out.println("I am watching Netflix.");}

    public String getFirstName(){
         return this.firstname ;
    }

    public String getLastName(){
        return this.lastname ;
    }

    //Setter
    public void setFirstName(String newname){
        this.firstname = newname;
    }

    public void setLastName(String newname){
        this.lastname = newname;
    }

    @Override
    public String toString (){
        return "Person's full name is: " + this.firstname + " " + this.lastname;
    }

}
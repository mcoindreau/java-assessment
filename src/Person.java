public class Person {

    protected String firstName;
    protected String lastName;

    public Person (String aFirstname, String alastName) throws IllegalArgumentException {
        this.firstName = "Mari";
        this.lastName = "Coindreau";

        if ((firstName = null) || (lastName = null)){
            throw new IllegalArgumentException(this.firstName, (this.lastName));
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }



}

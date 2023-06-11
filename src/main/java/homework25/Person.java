package homework25;


public class Person {
    private String firstName;
    //private String lastName;
    private int age;
    private String partner;
    private String address;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        //this.lastName = lastName;
        this.age = age;
//        this.partner = partner;
//        this.address = address;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAge() {
        System.out.println("Person age:" + age);
    }

    public void printAddress(String address) {
        System.out.println("Person address" + address);
    }

    public void printHuman() {
        System.out.println("I'm a human");
    }
}

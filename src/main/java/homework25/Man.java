package homework25;

public class Man extends Person {
    public Man(String firstName, int age) {
        super(firstName,age);
    }

    public boolean isRetiredMan() {
        return 65 < super.getAge();

    }
}
package homework25;

public class Women extends Person {
    public Women(String firstName, int age) {
        super(firstName, age);
    }
    public boolean isRetiredWomen() {
        return super.getAge() > 60;

    }
}
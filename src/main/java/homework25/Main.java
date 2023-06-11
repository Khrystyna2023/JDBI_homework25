package homework25;

public class Main {
    public static void main(String[] args) {

        Person women = new Person("Mary",70);
        Man men = new Man("Bob",  40);
        Women women1 = new Women("Anna", 24);

        System.out.println(women instanceof Person);
        System.out.println(men instanceof Man);
        System.out.println(women1 instanceof Women);


        System.out.println("Retired or Worker: " + women1.isRetiredWomen());
        System.out.println("Retired or Worker: " + men.isRetiredMan());
        women1.printAddress(": 152");
        women1.printAge();
        System.out.println("Partner:" + women1.getPartner());

    }
}

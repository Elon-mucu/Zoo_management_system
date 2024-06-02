package course_work;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Mucunguzi", 6);
        Animal elephant = new Elephant("Elon", 20);
        Animal monkey = new Monkey("Benjo", 7);

        System.out.println();
        System.out.println("These are the animals in the zoo and their behaviors ");

        System.out.println();
        System.out.println("--Lion--");
        lion.animal_details();
        lion.make_sound();
        lion.eat();

        System.out.println();
        lion.make_sound(2); // calling my overloaded method
        lion.eat("meat"); // calling my overloaded method

        System.out.println("======================================================");

        System.out.println("\n---Elephant---");
        elephant.animal_details();
        elephant.make_sound();
        elephant.eat();

        System.out.println();
        elephant.make_sound(3); // Demonstrating overloaded method
        elephant.eat("grass"); // Demonstrating overloaded method

        System.out.println("======================================================");

        System.out.println("----Monkey----");
        monkey.animal_details();
        System.out.print("Sound :");
        monkey.make_sound();
        monkey.eat();

        System.out.println();
        monkey.make_sound(4); // Demonstrating overloaded method
        monkey.eat("bananas"); // Demonstrating overloaded method
    }
}

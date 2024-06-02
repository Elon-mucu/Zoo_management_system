package course_work;

public class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    public void make_sound() {
        System.out.println("Chatter");
    }

    public void eat() {
        System.out.println("Eating Bananas");
    }
}

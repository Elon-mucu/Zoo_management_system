package course_work;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    // methods to override make_sound and eat methods
    public void make_sound() {
        System.out.println("Roar");
    }

    public void eat() {
        System.out.println("Eating meat");
    }
}

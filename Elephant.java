package course_work;

public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }
// override methods
    public void make_sound() {
        System.out.println("Trumpet");
    }

    public void eat() {
        System.out.println("Eating Grass");
    }

}

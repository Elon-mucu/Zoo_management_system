package course_work;

public class Animal {
    String name;
    int age;
//constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void make_sound() {
        System.out.println();
    }

    public void eat() {
        System.out.println();
    }

    public void animal_details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // method to overload sound to show the number times an animal makes sound
    public void make_sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Animal makes a sound ");
        }
    }

    // overload method for specifying the animal food_type
    public void eat(String food_type) {
        System.out.println(name + " eats " + food_type);
    }
}

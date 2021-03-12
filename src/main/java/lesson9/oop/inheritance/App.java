package lesson9.oop.inheritance;

public class App {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird2 = new Bird();

        Airplane airplane = new Airplane();


        handle(bird);
        handle(bird2);
        if (true) {
            handle(airplane);
        }
        Flyable.create();
        System.out.println(Flyable.age);
    }


    public static void handle(Flyable bird) {
        bird.fly();
    }

    public static void handle(Bird bird) {
        bird.eat();
    }
}

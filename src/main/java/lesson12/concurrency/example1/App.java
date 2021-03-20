package lesson12.concurrency.example1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        worker.start();
        for (long i = 0; i < 5_555_555_543L; i++) {
            if (i % 1_000_000_000 == 0) {
                System.out.println("Hello from Main!");
            }
        }
    }

    private static Thread worker = new Thread() {
        private Scanner scanner = new Scanner(System.in);

        @Override
        public void run() {
            int number;
            while ((number = scanner.nextInt()) != 0) {
                System.out.println(number * number);
            }
            System.out.println(getName() + " finished");
        }
    };
}

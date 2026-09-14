
import java.util.Random;

class Thread1 extends Thread {
    public void run() {
        try {
            Random r = new Random();

            while (true) {
                int num = r.nextInt(100);
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    new Thread2(num).start();
                } else {
                    new Thread3(num).start();
                }

                Thread.sleep(1000); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Thread for square
class Thread2 extends Thread {
    int num;

    Thread2(int n) {
        num = n;
    }

    public void run() {
        try {
            System.out.println("Square: " + (num * num));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Thread for cube
class Thread3 extends Thread {
    int num;

    Thread3(int n) {
        num = n;
    }

    public void run() {
        try {
            System.out.println("Cube: " + (num * num * num));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Main class
public class Cube {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
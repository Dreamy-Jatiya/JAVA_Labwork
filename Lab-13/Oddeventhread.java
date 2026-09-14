class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted: " + e);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted: " + e);
        }
    }
}

public class Oddeventhread {
    public static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();

        t1.start();
        t2.start();
    }
}

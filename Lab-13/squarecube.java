/*Write a java program that implements a multi-thread application that has 
three threads. First thread generates random integer every 1 second and if 
the value is even, second thread computes the square of the number and 
prints. If the value is odd, the third thread will print the value of cube of 
the number. [B]  */

class NumberThread extends Thread {
    public void run() {
        while (true) {
            int num = (int) (Math.random() * 100);
            System.out.println("Generated: " + num);
            if (num % 2 == 0) {
                SquareThread e1 = new SquareThread(num);
                e1.start();
            } else {
                CubeThread o1 = new CubeThread(num);
                o1.start();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square: " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube: " + (num * num * num));
    }
}

public class squarecube {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}

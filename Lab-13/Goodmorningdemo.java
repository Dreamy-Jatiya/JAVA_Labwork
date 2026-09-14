class MyThread1 implements Runnable {
    public void run(){
        while(true){
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class MyThread2 implements Runnable {
    public void run(){
        while(true){
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Goodmorningdemo {
    public static void main(String[] args) {
        MyThread1 th1=new MyThread1();
        Thread th2 = new Thread(th1);
        th2.start();
        MyThread2 th3=new MyThread2();
        Thread th4=new Thread(th3);
        th4.start();
    }
}

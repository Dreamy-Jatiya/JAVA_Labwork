class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello World");
            try{
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class MyThread1 implements Runnable {
    public void run(){
        while(true){
            System.out.println("Hello Student");
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
public class Runnabledemo {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        MyThread1 th2=new MyThread1();
        Thread th3 = new Thread(th2);
        th3.start();
    }
}
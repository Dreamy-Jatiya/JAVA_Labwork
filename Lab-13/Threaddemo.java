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
public class Threaddemo {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.start();
    }
}
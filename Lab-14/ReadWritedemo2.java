//File Output Stream
//import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWritedemo2 {
    public static void main(String[] args) {
        try{
           /*  FileInputStream fin=new FileInputStream("file.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();*/
            FileOutputStream fout=new FileOutputStream("d.txt");
            String data="heyy\nGood Morning\nbyyy";
            fout.write(data.getBytes());
            fout.close();
        }    
        catch(Exception e){
                e.printStackTrace();
        }
        
    }
}

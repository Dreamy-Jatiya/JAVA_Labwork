// File Input Stream
import java.io.FileInputStream;

public class ReadwriteDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("file.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }    
        catch(Exception e){
                e.printStackTrace();
        }
        
    }
}

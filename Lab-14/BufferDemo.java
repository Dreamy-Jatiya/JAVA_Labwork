//Buffer Reader
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferDemo {
    public static void main(String[] args) {
        try{
            //if byte strem then -1
            //if char stream then null
            //FileReader fr=new FileReader("file1.txt");
            //BufferedReader br=new BufferedReader(fr);
            //OR
            
            BufferedReader br=new BufferedReader(new FileReader("file.txt"));
            String line =br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

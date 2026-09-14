//Buffer Writer
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferDemo2 {
    public static void main(String[] args) {
        try{
            //if byte stream then -1
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
            BufferedWriter fw=new BufferedWriter(new FileWriter("d.txt"));
            String data="heyy\nGood Morning\nbyyy";
            fw.write(data);
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

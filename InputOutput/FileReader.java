import java.io.*;
public class FileReader {
    public static void main(String[] args) throws IOException{
        try {
            FileReader reader = new FileReader(new File("Introduction.txt"));
            BufferedReader br = new BufferedReader(reader);
            String message = "";
            while((message = br.readLine()) != null){
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

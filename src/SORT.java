import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SORT {
    public static void main(String[] args) {
        String path = "C:\\Users\\Renukananda T D\\IdeaProjects\\SORT\\src\\SORT - Sheet1.csv";
        String line = "";
        List<String> list= new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            PrintWriter pr = new PrintWriter("SORTED");
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    list.add(values[0]);
                }
                list.remove(0);
                Collections.sort(list);
                for (String i : list) {
                    pr.println(i);
                }
                pr.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
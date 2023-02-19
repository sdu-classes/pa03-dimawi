package OOPprB;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        try{
            String dimfile = "text.gitignore";
            String[] arr = ReadFile(dimfile);
            for(String s : arr){
                if(s != null) System.out.println(s);
                else break;
            }
        }catch(FileNotFoundException f){
            System.out.println("File not found");
        }catch(NullPointerException n ){
            System.out.println("Your file is null");
        }

    }
    public static String[] ReadFile(String s)throws FileNotFoundException, NullPointerException{
        File file = new File(s);
        int i = 0;
        Scanner q = new Scanner(file);
        String[] rows = new String[1000];
        while(q.hasNextLine()){
            rows[i] = q.nextLine();
            i++;
        }
        return rows;
    }
}


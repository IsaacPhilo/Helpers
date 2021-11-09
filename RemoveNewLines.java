import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class RemoveNewLines{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("words.txt"));
            String newS = "";
            while(sc.hasNext()){
                String temp = sc.next();
                if(!temp.equals("\n")){
                    newS += temp + " ";
                }
            }
            System.out.print(newS);
        }
        catch(IOException e){
            System.out.println("File not found!");
        }
    }
}
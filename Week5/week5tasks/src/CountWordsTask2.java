package Week5.week5tasks.src;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountWordsTask2 {
    public static void main(String[] args) {
        FileReader fr;
        FileWriter fw;
        int count = 0;
        try {
            fr = new FileReader("Week5\\week5tasks\\src\\Lincoln.txt");
            int i;
            while ((i = fr.read()) != -1){
                if ((char)i == ' '){
                    count++;
                }
            }
            count++;

            fw = new FileWriter("Week5\\week5tasks\\src\\Lincoln.txt", true);

            fw.write("Num Of Words = "+count);

            fr.close();
            fw.close();

        } catch(IOException fe){
            System.err.println(fe.getMessage());
        }
    }
}

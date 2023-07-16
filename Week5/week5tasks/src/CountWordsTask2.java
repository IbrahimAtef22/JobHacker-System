package Week5.week5tasks.src;

import java.io.*;

public class CountWordsTask2 {
    public static void main(String[] args) {
        File fileToRead = new File("Week5\\week5tasks\\src\\Lincoln.txt");
        int numOfWords = countWordsInFile(fileToRead);

        File fileToWrite = new File("Week5\\week5tasks\\src\\CountWordsInLincolnFile.txt");
        writeNumOfWordsInFile(fileToWrite, numOfWords);

    }

    // write to file a number of words calculated in another file
    public static void writeNumOfWordsInFile(File fileToWrite, int numOfWords){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileToWrite);
            fileWriter.write("Num Of Words In Lincoln File = "+numOfWords);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // read from file and count number of words in a file
    public static int countWordsInFile(File fileToRead){
        String[] excludedChars = {" ", ",", "--"};
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    boolean excluded = false;
                    for (String excludedChar : excludedChars) {
                        if (word.equals(excludedChar)) {
                            excluded = true;
                            break;
                        }
                    }
                    if (!excluded) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return wordCount;
    }

}

package Week5.week5tasks.src;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class CalcSumAndAvgFromFile {
    public static void main(String[] args) {
        String url = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        String fileName = "Week5\\week5tasks\\src\\Scores.txt";
        File file = new File(fileName);
        int sumOfValues = getSum(file);
        int averageOfValues = getAverage(file);

        try (FileWriter fileWriter = readFromWebToFile(url)) {
            if (fileWriter != null) {
                fileWriter.write("\nSum Of Values in the File = " + sumOfValues);
                fileWriter.write("\nAverage Of Values in the File = " + averageOfValues + "\n");
                fileWriter.flush();
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static FileWriter readFromWebToFile(String url) {

        FileWriter fw = null;

        try {
            URL urlObj = new URL(url); // creating an url object
            URLConnection urlConnection = urlObj.openConnection(); // creating an urlConnection object

            // wrapping the urlConnection in a bufferedReader
            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            fw = new FileWriter("Week5\\week5tasks\\src\\Scores.txt", true);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fw.append(line);
                fw.append("\n");
            }
            fw.flush();
            bufferedReader.close();


        } catch (IOException fe) {
            System.err.println(fe.getMessage());
            //return null;
        }
        return fw;
    }

    public static int getSum(File file) {
        int sum = 0;
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }


        if (scan != null) {
            while (scan.hasNextInt()) {
                try {
                    int number = scan.nextInt();
                    sum += number;
                } catch (NumberFormatException | NullPointerException e) {
                    System.err.println(e.getMessage());
                }
            }
        }


        return sum;
    }

    public static int getAverage(File file) {
        int sum = 0;
        int count = 0;
        int average;
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }


        if (scan != null) {
            while (scan.hasNextInt()) {
                try {
                    int number = scan.nextInt();
                    sum += number;
                    count++;
                } catch (NumberFormatException | NullPointerException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        count++;

        average = sum / count;
        return average;

    }
}

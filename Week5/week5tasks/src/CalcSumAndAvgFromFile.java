package Week5.week5tasks.src;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class CalcSumAndAvgFromFile {
    public static void main(String[] args) {
        String url = "http://liveexample.pearsoncmg.com/data/Scores.txt";

        try (FileWriter fileWriter = readFromWebToFile(url)) {
            String fileName = "Week5\\week5tasks\\src\\Scores.txt";
            File file = new File(fileName);
            int sumOfValues = getSum(file);
            int averageOfValues = getAverage(file);
            if (fileWriter != null) {
                fileWriter.write("\nSum Of Values in the File = " + sumOfValues);
                fileWriter.write("\nAverage Of Values in the File = " + averageOfValues + "\n");
                fileWriter.flush();
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    // connect to url on the web
    public static URLConnection getConnectionWithURL(String url){
        URLConnection urlConnection;
        try {
            URL urlObj = new URL(url); // creating an url object
            urlConnection = urlObj.openConnection(); // creating an urlConnection object
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return urlConnection;
    }

    // read from url and write to file
    public static FileWriter readFromWebToFile(String url) {
        URLConnection urlConnection = getConnectionWithURL(url);
        FileWriter fw = null;

        try {
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
                } catch (NumberFormatException e) {
                    System.err.println(e.getMessage());
                } catch (NullPointerException e) {
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

        average = sum / count;
        return average;
    }
}

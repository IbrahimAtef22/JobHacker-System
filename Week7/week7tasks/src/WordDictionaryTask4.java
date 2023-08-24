package Week7.week7tasks.src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Simple Word Dictionary Class
 */
public class WordDictionaryTask4 {
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        TreeMap<Character, TreeSet<String>> dictionary = new TreeMap<>();

        System.out.print("Enter number of alphabets to add to a Dictionary: ");
        int noOfAlphabets = input.nextInt();
        input.nextLine();

        while (i < noOfAlphabets){

            System.out.print("Enter an alphabet to add to the Dictionary : ");
            char key = input.next().toLowerCase().charAt(0);

            TreeSet<String> values = new TreeSet<>();

            System.out.print("Enter number of words you want to add to that alphabet: ");
            int noOfWords = input.nextInt();
            input.nextLine();

            System.out.println("Enter Your words starting with the character you entered :");
            int j = 0;
            while (j < noOfWords){
                String word = input.nextLine();
                if (word.charAt(0) == key){
                    values.add(word);
                }else{
                    System.out.println("please enter a word starting with the character you entered!!");
                    continue;
                }
                j++;
            }

            dictionary.put(key, values);
            i++;
        }

        do {
            System.out.println("Choose an operation:");
            System.out.println("1- Print all the letters and the corresponding words.");
            System.out.println("2- Print the words of a given letter.");
            System.out.println("3- Exit.");

            int operation = input.nextInt();
            input.nextLine();
            switch (operation){
                case 1:
                    printAllLettersWithWords(dictionary);
                    break;
                case 2:
                    System.out.println("Enter the letter you want its words:");
                    char letter = input.next().toLowerCase().charAt(0);

                    if (dictionary.containsKey(letter)){
                        printWordsOfLetter(dictionary, letter);
                    }else {
                        System.out.println("The Dictionary doesn't contain that letter!!! try again.");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose an available operation!!!");
            }


        }while(true);

    }

    // method to print all the letters with the corresponding words
    public static void printAllLettersWithWords(TreeMap<Character, TreeSet<String>> dict){
        for(Map.Entry m : dict.entrySet()){
            System.out.println(m.getKey()+" :");
            System.out.println(m.getValue());
        }
    }

    // method to print the words of a given letter
    public static void printWordsOfLetter(TreeMap<Character, TreeSet<String>> dict, Character letter){
        TreeSet<String> set = dict.get(letter);

        for(String word : set){
            System.out.println(word);
        }
    }
}

package Week7.week7tasks.src;

import java.util.*;

/**
 * Operations on LinkedHashSet
 */

public class LinkedHashSetTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 0;
        // take no. of test cases
        int testCases = input.nextInt();

        while (i < testCases){
            // take no. of queries
            int noOfQueries = input.nextInt();
            input.nextLine();
            int j = 0;
            while (j < noOfQueries){
                // take query input
                String query = input.nextLine();


                char character = query.charAt(0);

                switch (character){
                    case 'a':
                        set.add(Integer.parseInt(query.substring(2)));
                        break;
                    case 'b':
                        // Convert LinkedHashSet to an ArrayList
                        ArrayList<Integer> list = new ArrayList<>(set);

                        // sort ArrayList
                        Collections.sort(list);

                        for (Integer item : list) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        break;
                    case 'c':
                        set.remove(Integer.parseInt(query.substring(2)));
                        break;
                    case 'd':
                        if (set.contains(Integer.parseInt(query.substring(2)))){
                            System.out.println("1");
                        }else{
                            System.out.println("-1");
                        }
                        break;
                    case 'e':
                        System.out.println(set.size());
                        break;
                    case 'f':
                        for (Integer item : set) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Incorrect query!!!");
                        continue;
                }
                j++;
            }
            i++;
        }

    }
}

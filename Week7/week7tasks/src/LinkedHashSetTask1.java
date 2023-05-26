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

                if (query.length() > 1 && query.contains(" ")){

                        String[] elements = query.split(" ");
                        if(elements.length == 2){
                            switch (elements[0]){
                                case "a":
                                    set.add(Integer.valueOf(elements[1]));
                                    break;
                                case "c":
                                    set.remove(Integer.valueOf(elements[1]));
                                    break;
                                case "d":
                                    if (set.contains(Integer.valueOf(elements[1]))){
                                        System.out.println("1");
                                    }else{
                                        System.out.println("-1");
                                    }
                                    break;
                                default:
                                    System.out.println("Incorrect query!!!");
                                    continue;
                            }
                        }else {
                            System.out.println("Incorrect query!!!");
                            continue;

                        }

                }else if (query.length() == 1){
                        switch (query.charAt(0)){
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
                }
                j++;
            }
            i++;
        }

    }
}

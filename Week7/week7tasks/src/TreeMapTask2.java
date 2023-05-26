package Week7.week7tasks.src;

import java.util.*;

/**
 * Implement different operations on a TreeMap
 */
public class TreeMapTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        // take no. of test cases
        int testCases = input.nextInt();

        while (i < testCases) {
            // take no. of queries
            int noOfQueries = input.nextInt();
            input.nextLine();
            int j = 0;
            while (j < noOfQueries) {
                // take query input
                String query = input.nextLine();

                if (query.length() > 1 && query.contains(" ")) {

                    String[] elements = query.split(" ");
                    if (elements.length == 3) {
                        if (elements[0].equals("a")) {
                            Integer key = Integer.valueOf(elements[1]);
                            Integer value = Integer.valueOf(elements[2]);
                            map.put(key, value);

                        } else {
                            System.out.println("Incorrect query!!!");
                        }

                    } else {
                        switch (elements[0]) {
                            case "b":
                                if (map.containsKey(Integer.valueOf(elements[1]))) {
                                    Integer key = Integer.valueOf(elements[1]);
                                    System.out.println(map.get(key));
                                } else {
                                    System.out.println("-1");
                                }
                                break;

                            case "d":
                                map.remove(Integer.valueOf(elements[1]));
                                break;

                            default:
                                System.out.println("Incorrect query!!!");
                                continue;
                        }
                    }
                } else if (query.length() == 1) {
                    switch (query.charAt(0)) {
                        case 'c':
                            System.out.println(map.size());
                            break;
                        case 'e':
                            for (Map.Entry m : map.entrySet()) {
                                System.out.println(m.getKey() + " " + m.getValue());
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

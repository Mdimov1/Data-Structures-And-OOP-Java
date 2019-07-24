/*
You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist_Number_Location {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer>[] arrays = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            arrays[i] = new ArrayList<Integer>();
        }

        int d;
        int num;

        //In array 'n' add 'd' numbers
        for (int i = 0; i < n; i++) {
            d = Integer.parseInt(input.next());

            for (int j = 0; j < d; j++) {
                num = Integer.parseInt(input.next());
                arrays[i].add(num);
            }
            input.nextLine();
        }

        //Find the number in position x y
        int x, y;
        n = input.nextInt();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            x = input.nextInt() - 1;
            y = Integer.parseInt(input.next()) - 1;

            if(arrays[x].size() > y) {
                result[i] = String.valueOf(arrays[x].get(y));
            } else {
                result[i] = "ERROR!";
            }
            input.nextLine();
        }

        //Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

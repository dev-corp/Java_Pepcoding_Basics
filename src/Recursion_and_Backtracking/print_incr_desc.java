package Recursion_and_Backtracking;

import java.util.Scanner;

public class print_incr_desc {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        pdi(num);
    }
    public static void pdi(int num)
    {
        if(num == 0)
            return;
        System.out.println(num);
        pdi(num - 1);
        System.out.println(num);
    }
}

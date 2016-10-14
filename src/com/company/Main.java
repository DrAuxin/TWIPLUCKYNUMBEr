
package com.company;
        import java.util.*;
public class Main {
    //h
    public static void main(String[] args) {
        int a = 2;
        String list = "List of users and their lucky numbers";
        Scanner user = new Scanner(System.in);
        while (a == 2 || a == 1)
        {
            if (a == 2)
            {
                System.out.println("What is your name?");
                String n = user.next();
                System.out.println("Hi " + n + ".");
                Generator b = new Generator(n);
                b.perfectRandom();
                System.out.println("Your lucky number is " + b.luck + ".");
                list = list + '\n' + b.name + " " + b.luck;
            }
            System.out.println("Insert 0 to exit, 1 for list of users and their lucky numbers, or 2 for a new user");
            a = user.nextInt();
            if (a == 1)
                System.out.println(list);
        }

    }
}
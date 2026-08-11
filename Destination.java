package Java_Basics;

import java.util.Scanner;

public class Destination {

    public static boolean isReachable(int a, int b, int x) {

        int distance = Math.abs(a) + Math.abs(b);

        if (x < distance) {
            return false;
        }

        return (x - distance) % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        boolean result = isReachable(a, b, x);

        System.out.println("Output: " + result);

        sc.close();
    }
}
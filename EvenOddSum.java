package Java_Basics;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int EvenSum=0;
        int OddSum=0;
        System.out.println("Enter the number of integers:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                EvenSum+=num;
            }else {
                OddSum+=num;
            }
        }
        System.out.println("Sum of even integers: "+EvenSum);
        System.out.println("Sum of odd integers: "+OddSum);

        sc.close();
    }
}

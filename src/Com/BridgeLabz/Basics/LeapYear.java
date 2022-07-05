package Com.BridgeLabz.Basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Year");
        int y = n.nextInt();

        if(y%400==0 && y%100==0 || y%100!=0 && y%4==0) {
            System.out.println("its a leap year");
        }else{
            System.out.println("not a leap year");
        }
    }

}

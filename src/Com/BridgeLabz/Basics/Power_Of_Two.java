package Com.BridgeLabz.Basics;

import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of N");
        int N=s.nextInt();
        if(N>=0 && N<=31){
            for(int i=1; i<=N; i++){
                System.out.println("2 *" +i+ "=" +(2*i));

            }

        }
        else{
            System.out.println("overflow");
        }
    }


}

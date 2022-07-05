package Com.BridgeLabz.Basics;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int Head = 0;
        int Tail = 0;
        int count = 1;
        double random = 0.0;

        System.out.println("Enter a numbers of time coin flips: ");
        try (Scanner n = new Scanner(System.in)) {
            int Flip = n.nextInt();

            while (count <= Flip) {
                random = Math.random();
                System.out.println(count + " " + random);

                if (random < 0.5) {
                    Head = Head + 1;
                    System.out.print("Head");
                } else {
                    Tail = Tail + 1;
                    System.out.println("Tail");
                }
                count = count + 1;
                System.out.println("Number of Head: "+Head);
                System.out.println("Number of Tail: "+Tail);

                double headpercentage=(double)Head/Flip*100;
                double tailpercentage=(double)Tail/Flip*100;

                System.out.println("percentage of Head= "+headpercentage);
                System.out.println("percentage of Tail= "+tailpercentage);




            }

        }
    }
}

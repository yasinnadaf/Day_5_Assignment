package Com.BridgeLabz.Basics;

public class Largest_Among_threeNumber {
    public static void main(String[] args) {
        int p=45;
        int q= 56;
        int r=77;

        if(p>=q && p>=r){
            System.out.println("p is largest");
        }
        else if (q>=p && q>=r){
            System.out.println("q is largest");
        }
        else{
            System.out.println("r is largest");
        }
    }
}

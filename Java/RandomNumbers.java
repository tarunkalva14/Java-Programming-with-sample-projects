import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random rd = new Random();
        int n1;
        double n2;
        boolean isHeads;

        n1 = rd.nextInt(0,20);
        n2 = rd.nextDouble(20,50);
        isHeads = rd.nextBoolean();

        if(isHeads){
            System.out.println("It's Heads");
        }
        else{
            System.out.println("It's Tails");
        }
        System.out.println(n1);
        System.out.println(n2);


    }
}

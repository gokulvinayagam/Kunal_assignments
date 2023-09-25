import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner gok = new Scanner(System.in);
        int a = gok.nextInt();
        // System.out.println(a);
        // System.out.println(a%2);
        if (a%2==0){
            System.out.println("a is the even Number"); //a%2 will give the remainder

        }
        else {
            System.out.println("a is the odd number");
        }

    }
}

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        int Princple = input.nextInt();
        System.out.println("Enter the Number of years:");
        float Time = input.nextFloat();
        System.out.println("Enter the Interest:");
        float Interest = input.nextFloat();

        double SI = Princple*Time*Interest/100;
        System.out.println("The Simple Interest is: " + SI);
    }
}

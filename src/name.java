import java.util.Scanner;

public class name {
    public static void main(String[] args) {
         //System.out.println("Enter Your Name:" );
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Name = input.nextLine();
        System.out.println(Name + " " + "welcome to the club");
    }
}

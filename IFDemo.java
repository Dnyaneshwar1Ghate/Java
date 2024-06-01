
import java.util.Scanner;

public class IFDemo {
    public static void main(String[] args) {
        System.out.println("IF Demo");

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age ");
        age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are able for vote");
        }
        else {
            System.out.println("Not able to vote");

        }
        sc.close();
        
        
    }

}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plate number:");
        String plateno = sc.nextLine();
        System.out.println("Enter the Driver's name:");
        String Name = sc.nextLine();
        System.out.println("Driver's is: " + Name);
        System.out.println("The plate number is: " + plateno);

    }
}
import java.util.Scanner;

class TheaterKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 21) {
            System.out.println("You get a wristband.");
        }

        input.close();
    }
}

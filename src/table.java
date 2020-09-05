import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);
        System.out.println("Please enter number and I will compute a multiplication table for you: ");

        int userNumber = number.nextInt();
        System.out.println("you entered: " + userNumber + " Here is yout multiplication table:");


        for (int i =1; i <= userNumber; i++){
            for (int j =1; j <= userNumber; j++){
            System.out.print( i * j + " ");
        }
            System.out.println();
    }
}
}
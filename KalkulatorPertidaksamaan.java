import java.util.Scanner;

public class KalkulatorPertidaksamaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        double x = input.nextDouble();
        System.out.print("Masukkan operator (>, <, >=, <=): ");
        String operator = input.next();
        System.out.print("Masukkan nilai batas: ");
        double batas = input.nextDouble();

        boolean hasil = false;
        boolean valid = true;

        if (operator.equals(">")) {
            hasil = x > batas;
        } else if (operator.equals("<")) {
            hasil = x < batas;
        } else if (operator.equals(">=")) {
            hasil = x >= batas;
        } else if (operator.equals("<=")) {
            hasil = x <= batas;  
        } else {
            System.out.println("Operator tidak valid.");
            valid = false;
        }

        if (valid) {
            System.out.println(x + " " + operator + " " + batas + " : " + hasil);
        }
    }
}
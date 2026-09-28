import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan operator (>, <, >=, <=): ");
        String operator = input.next();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        double hasil = 0;
        String operatorHasil = "";
        boolean adaHasil = true;
        boolean kondisi = false;
        boolean valid = true;

        if (operator.equals(">")) {
            if (a > 0) {
                operatorHasil = ">";
            } else if (a < 0) {
                operatorHasil = "<";
            } else {
                adaHasil = false;
                kondisi = b > c;
            }
        } else if (operator.equals("<")) {
            if (a > 0) {
                operatorHasil = "<";
            } else if (a < 0) {
                operatorHasil = ">";
            } else {
                adaHasil = false;
                kondisi = b < c;
            }
        } else if (operator.equals(">=")) {
            if (a > 0) {
                operatorHasil = ">=";
            } else if (a < 0) {
                operatorHasil = "<=";
            } else {
                adaHasil = false;
                kondisi = b >= c;
            }
        } else if (operator.equals("<=")) {
            if (a > 0) {
                operatorHasil = "<=";
            } else if (a < 0) {
                operatorHasil = ">=";
            } else {
                adaHasil = false;
                kondisi = b <= c;
            }
        } else {
            valid = false;
        }

        if (valid == false) {
            System.out.println("Operator tidak valid.");
        } else if (adaHasil) {
            hasil = (c - b) / a;
            System.out.println("Hasil penyelesaian: x " + operatorHasil + " " + hasil);
        } else {
            if (kondisi) {
                System.out.println("Semua nilai x memenuhi.");
            } else {
                System.out.println("Tidak ada nilai x yang memenuhi.");
            }
        }

        input.close();
    }
}
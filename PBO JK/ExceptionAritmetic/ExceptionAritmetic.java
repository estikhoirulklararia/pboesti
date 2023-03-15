import java.util.Scanner;

public class ExceptionAritmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, hasil;

        System.out.print("Masukkan bilangan pertama: ");
        num1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        num2 = input.nextInt();

        try {
            hasil = num1 / num2;
            System.out.println("Hasil pembagian adalah: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmetik: " + e.getMessage());
        }

        System.out.println("Program selesai.");
    }
}
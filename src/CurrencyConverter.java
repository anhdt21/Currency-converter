import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rate = 23000 ;
        System.out.print("Nhập vào giá trị USD cần đổi : ");
        Scanner sc = new Scanner(System.in);
        double USD = sc.nextDouble();
        System.out.println("Giá trị VND là :"+ Math.round(USD*rate) +" VND");
    }
}

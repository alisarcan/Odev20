import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, us,  total=1;

        System.out.print("üssü alınacak sayıyı girniiz : ");
        num = input.nextInt();

        System.out.print("Üs giriniz : ");
        us = input.nextInt();
        for (int i = 1; i<=us; i++){
            total*=num;
        }
        System.out.println(total);

    }
}

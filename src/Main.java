import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
    /*
        System.out.print("Enter username: ");
        String username=input.nextLine();
        System.out.print("Enter password: ");
        String password=input.nextLine();

        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Giriş başarılı.");
        }
        else {
            System.out.println("Giriş başarısız.");
        }
     */
        System.out.print("İlk sayıyı girin: ");
        int number1=input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int number2=input.nextInt();
        int sum=number1+number2;
        int mult=number1*number2;

        System.out.println("Sayıların toplamı: "+sum);
        System.out.println("Sayıların çarpımı: "+mult);

    }
}

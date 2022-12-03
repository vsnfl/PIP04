import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Witamy w kantorze!\nWybierz walutę:\n1 - PLN\n2 - JPY");
        int waluta = skanuj.nextInt();
        System.out.println("Podaj kwotę: ");
        double kwota = skanuj.nextDouble();
        double przeliczonaKwota;
        if (waluta == 1){
            przeliczonaKwota = kwota * 30.27;
            przeliczonaKwota = Math.round(przeliczonaKwota * 100.0) / 100.0;
            System.out.println(kwota + "PLN => " + przeliczonaKwota + "¥");
        } else if (waluta == 2){
            przeliczonaKwota = kwota * 0.033;
            przeliczonaKwota = Math.round(przeliczonaKwota * 100.0) / 100.0;
            System.out.println(kwota + "¥ => " + przeliczonaKwota + "PLN");
        } else {
            System.out.println("Podano złą walutę!");
        }
    }
}
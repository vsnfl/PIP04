import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = skanuj.nextInt();
        System.out.println("Podaj druga liczbę: ");
        int y = skanuj.nextInt();
        System.out.println("Jaką wykonać operację na podanych liczbach (ADD, SUB, DIV lub MUL)?");
        String operation = skanuj.next().toUpperCase();
        int wynik = 0;

        switch(operation){
            case "ADD":
                wynik = x+y;
                break;
            case "SUB":
                wynik = x-y;
                break;
            case "DIV":
                wynik = x/y;
                break;
            case "MUL":
                wynik = x*y;
                break;
        }
        System.out.println("Wynik działania to: " + wynik );
    }
}
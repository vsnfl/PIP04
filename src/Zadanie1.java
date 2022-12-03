import java.util.Scanner;

public class Zadanie1 {
    public static void stanPogody(boolean deszcz, boolean slonce){
        if (deszcz == true && slonce == true){
            System.out.println("Tęcza");

        } else if (slonce == true) {
            System.out.println("Słonenie");
        } else if (deszcz == true) {
            System.out.println("Plucha");
        } else {
            System.out.println("Pochmurno");
        }
    }
    public static void main(String[] args) {
        boolean czyPada = true;
        boolean czySwieciSlonce = true;
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Czy pada? Odpowiedz: tak lub nie ");
        String x = skanuj.next().toLowerCase();
        System.out.println("Czy świeci słońce? Odpowiedz: tak lub nie ");
        String y = skanuj.next().toLowerCase();
        if (x.equals("nie")){
            czyPada = false;
        }
        if (y.equals("nie")){
            czySwieciSlonce = false;
        }
        stanPogody(czyPada, czySwieciSlonce);

    }
}
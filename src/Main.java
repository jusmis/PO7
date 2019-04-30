import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String input;
        Wektor wektor1, wektor2;
        Scanner sc = new Scanner(System.in);
        while(0 == 0){
            System.out.println("Podaj dwa wektory rownej dlugosci. Wprowadzanie wektora zakończ wciśnięciem klawisza enter.");
            input = sc.nextLine();
	    if (input.compareTo("quit")==0)
     		System.exit(0);
            wektor1 = new Wektor(input);
            if (wektor1.isPoprawnyWektor() == false)
                continue;
            input = sc.nextLine();
	    if (input.compareTo("quit")==0)
     		System.exit(0);
            wektor2 = new Wektor(input);
            if (wektor2.isPoprawnyWektor() == false)
                continue;
            System.out.println(wektor1.getWektor());
            System.out.println(wektor2.getWektor());
            try {
                Wektor.sprawdzCzyWektorySaTejSamejDlugosci(wektor1, wektor2);
            } catch (WektoryRoznejDlugosciException e){
                e.getMessage();
                System.out.println("Dlugosc pierwszego wektora to: " + e.getWektor1Size() + ", a drugiego to: " + e.getWektor2Size());
                continue;
            }
            Wektor wektorWynikowy = Wektor.dodajDwaWektory(wektor1, wektor2);
            System.out.println(wektorWynikowy.getWektor());
            try {
                wektorWynikowy.zapiszDoPliku("wektor.txt");
                break;
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/Asia/Desktop/Cars.txt");
        Queue<Car> kolejka = new ArrayDeque();
        kolejka = Methods.addCars(file);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Stacja kontroli pojazdów");
        System.out.println("W kolejce aktualnie oczekuje:" + kolejka.size());
        System.out.println("Podaj liczbę 0 dla zakończenia działania");
        System.out.println("Podaj liczbę 1 aby dodać nowy pojazd");
        System.out.println("Podaj liczbę 2 aby pobrać kolejny pojazd do przeglądu");

        int wybor = 0;
        do {wybor = scanner.nextInt();}
        while (wybor > 3 || wybor < 0);

        while(wybor!=0){
            switch(wybor){
                case 1:

                    break;

                case 2:
                    System.out.println();
kolejka.add();
                    break;

                case 3:


            }

            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();

            wybor = menu();
        }


        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");
    }



    }
}

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/rtaj/Desktop/Cars.txt");
        Queue<Car> kolejka = new ArrayDeque();
        kolejka = Methods.addCars(file);

        Scanner scanner = new Scanner(System.in);


        Methods.menu(kolejka);

        int wybor;
        do {
            wybor = scanner.nextInt();
        }
        while (wybor > 3 || wybor < 0);

        while (wybor != 0) {
            switch (wybor) {
                case 1:
                    System.out.println("Podaj dane pojazdu: Typ, Model, Markę, Rok Produkcji, Przebieg, numer VIN");
                    scanner.nextLine();
                    String typ = scanner.nextLine();
                    String model = scanner.nextLine();
                    String marka = scanner.nextLine();
                    int rok = scanner.nextInt();
                    int przebieg = scanner.nextInt();
                    scanner.nextLine();
                    String VIN = scanner.nextLine();
                    Car car = new Car(typ, model, marka, rok, przebieg, VIN);
                    System.out.println(car);
                    kolejka.add(car);
                    break;

                case 2:
                    System.out.println("Wybrano kolejny pojazd: " + kolejka.poll());
                    break;

            }

            System.out.println("\nWciśnij 1 lub 2, aby kontynuować lub 0 aby zakończyć");
            wybor = scanner.nextInt();

        }


        System.out.println("****************************************");
        System.out.println("\nKoniec programu\n\n");

        System.out.println("W kolejce oczekuje:" + kolejka.size() + " pojazdow.");

        Methods.checkOut(kolejka);

    }


}

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Methods<ans> {

    static Queue<Car> addCars(File file) throws FileNotFoundException {
        Queue<Car> kolejka = new ArrayDeque();

        Scanner in = new Scanner(file);
        if (file.exists()) {
            while (in.hasNextLine()) {
                String carString = in.nextLine();
                String[] split = carString.split(";");
                Car car = new Car(split[0], split[1], split[2], Integer.valueOf((split[3])), Integer.valueOf((split[4])), split[5]);
                kolejka.add(car);
            }
            in.close();
        }
        return kolejka;
    }


    static void menu(Queue kolejka) {

        System.out.println("Stacja kontroli pojazdów");
        System.out.println("W kolejce aktualnie oczekuje:" + kolejka.size());
        System.out.println("Podaj liczbę 0 dla zakończenia działania");
        System.out.println("Podaj liczbę 1 aby dodać nowy pojazd");
        System.out.println("Podaj liczbę 2 aby pobrać kolejny pojazd do przeglądu");
    }

    static void checkOut(Queue kolejka) throws FileNotFoundException {

        PrintWriter zapis = new PrintWriter("C:/Users/rtaj/Desktop/Cars.txt");
        while (!kolejka.isEmpty()) {
            zapis.println(kolejka.poll());
        }
        zapis.close();
    }

    static void addNewCar(Queue kolejka) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane pojazdu: Typ, Model, Markę, Rok Produkcji, Przebieg, numer VIN");
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

    }

}
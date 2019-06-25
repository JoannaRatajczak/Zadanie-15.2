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

        int wybor = 0;

        do {
            wybor = scanner.nextInt();


            switch (wybor) {
                case 0:
                    break;
                case 1:
                    Methods.addNewCar(kolejka);
                    System.out.println("\nWciśnij 1 lub 2, aby kontynuować lub 0 aby zakończyć");
                    break;
                case 2:
                    System.out.println("Wybrano kolejny pojazd: " + kolejka.poll());
                    System.out.println("\nWciśnij 1 lub 2, aby kontynuować lub 0 aby zakończyć");
                    break;

            }


        }
        while (wybor > 0 && wybor < 3);

        System.out.println("****************************************");
        System.out.println("\nKoniec programu\n\n");
        System.out.println("W kolejce oczekuje:" + kolejka.size() + " pojazdow.");

        Methods.checkOut(kolejka);

    }


}

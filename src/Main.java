import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca: ");
        int poraRoku = scanner.nextInt();
        switch (poraRoku) {
            case 3, 4, 5:
                System.out.println("Pora roku to WIOSNA");
                break;
            case 6, 7, 8:
                System.out.println("Pora roku to LATO");
                break;
            case 9, 10, 11:
                System.out.println("Pora roku to JESIEN");
                break;
            case 12, 1, 2:
                System.out.println("Pora roku to JESIEN");
                break;
            default:
                System.out.println("Podałeś zły miesiąc");
        }
        String names[] = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Imiona od konca");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i] * 2);
            i++;
        }
        int j = 0;
        do {
            if ((j % 2) == 0) {
                System.out.println(j + " to liczba parzysta");
            } else {
                System.out.println(j + " to liczba nieparzysta");
            }
            j++;
        } while (j <= 20);
        for (int k = 0; k <= 50; k++) {
            System.out.println("Wartosc licznika k to: " + k);
            if (k == 10) break;
        }
        int l = 0;
        while (l <= 50) {
            if (l % 3 == 0) {
                l++;
                continue;
            }
            System.out.println("Wartosc licznika wynosi l: " + l);
            l++;
        }
        while (true) {
            int random = (int) Math.round(10 * Math.random());
            System.out.println(random);
            if (random == 10) break;
        }
        for (; ; ) {
            int random = (int) Math.round(100 * Math.random());
            System.out.println(random);
            if (random == 100) break;
        }
        int sumNumbers=0;
        while (true) {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj liczbę lub tekst QUIT aby zakonczyc program: ");
            String input = null;
            int number=0;
            try {
                input = buf.readLine();
                number = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Podales tekst rozny od QUIT oraz nie bedzący liczbą Integer");
            }
            if (input.equalsIgnoreCase("QUIT"))
                break;
            sumNumbers+=number;
            System.out.println("Podales liczbe: " + number+ " a suma wynosi: "+ sumNumbers);
        }
        int help=0;
        int number[]={5,4,8,9,5};
        for (int z : number) {
            help+=z;
            System.out.println("Wartosc tablicy: " +z);
        }
        System.out.println("Help wynosi: "+ help);
    }
}

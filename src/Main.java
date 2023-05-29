import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double boy,kilo,vki;
        System.out.println("Lutfen Boy Olcunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lutfen Kilonuzu Kilogram Cinsinden Giriniz : ");
        kilo = input.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("Vucut Kutle Indeksiniz : "+vki);



        }
    }

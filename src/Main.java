import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return a + b;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma Sonucu: " + result);
        return a - b;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım Sonucu: " + result);
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {

            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs Alma Sonucu: " + result);
        return result;
    }

    static int factoriel(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "'nın Faktöriyeli: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod'un Sonucu: " + result);
        return result;
    }

    static void calculate(int a, int b) {
        System.out.println("Çevresi: " + 2 * (a + b));
        System.out.println("Alanı: " + a * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen Bir İşle Seçiniz: ");
            select = scanner.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("İlk Değerini Giriniz: ");
            int a = scanner.nextInt();
            System.out.print("İkinci değeri Giriniz: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("2.Değer 0'dan farklı olmalı !");
                    }
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factoriel(a);

                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    calculate(a, b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem !");
            }
        }
        System.out.println("Kenide İyi bAk !");
    }
}

import java.util.Scanner;

public class Sinemaseans {
    public static void main(String[] args) {
        //int seansid = 0;
        //int koltukSayi = 0;

        Film film1 = new Film("Avengers", "120");
        Film film2 = new Film("Sparta", "100");
        Film film3 = new Film("Asteriks ve oburiks", "130");
        Film secilenFilm;

        Salon salon1 = new Salon("Salon 1A", 50);
        Salon salon2 = new Salon("Salon 2A", 20);
        Salon salon3 = new Salon("Salon 1B", 40);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Film seçiniz");
        System.out.println("1) " + film1.filmAdi);
        System.out.println("2) " + film2.filmAdi);
        System.out.println("3) " + film3.filmAdi);

        int secilen_film = scanner.nextInt();
        switch (secilen_film) {
            case 1:
                System.out.println("Seçtiğin film " + film1.filmAdi);
                secilenFilm = film1;
                break;
            case 2:
                System.out.println("Seçtiğin film " + film2.filmAdi);
                secilenFilm = film2;
                break;
            case 3:
                System.out.println("Seçtiğin film " + film3.filmAdi);
                secilenFilm = film3;
                break;
            default:
                System.out.println("Geçerli film girin");
                return;
        }

        Seans seans1 = new Seans(secilenFilm, salon1, "10.15");
        Seans seans2 = new Seans(secilenFilm, salon2, "11.55");
        Seans seans3 = new Seans(secilenFilm, salon3, "14.30");
        Seans secilenSeans;

        System.out.println("Seans Seçiniz");
        System.out.println("1) " + seans1.tarih);
        System.out.println("2) " + seans2.tarih);
        System.out.println("3) " + seans3.tarih);

        int secilen_Seans = scanner.nextInt();
        switch (secilen_Seans) {
            case 1:
                System.out.println("Seçtiğin Seans " + seans1.tarih);
                secilenSeans = seans1;
                break;
            case 2:
                System.out.println("Seçtiğin Seans " + seans2.tarih);
                secilenSeans = seans2;
                break;
            case 3:
                System.out.println("Seçtiğin Seans " + seans3.tarih);
                secilenSeans = seans3;
                break;
            default:
                System.out.println("Geçerli seans girin");
                return;
        }

        System.out.print("Müşteri ismini yazınız: ");
        String musteriAdi = scanner.next();

        System.out.print("Kaç koltuk alınacak: ");
        int koltuk = scanner.nextInt();
        if (secilenSeans.salon.salonKapasitesi < koltuk) {
            System.out.println("Yetersiz koltuk");
            return;
        }

        System.out.println("Koltuk seçiniz");
        String[] koltukYerleri = new String[koltuk];
        for (int i = 0; i < koltukYerleri.length; i++) {
            koltukYerleri[i] = scanner.next();
        }
        Rezervasyon rezervasyon = new Rezervasyon(secilenSeans, musteriAdi, koltuk, koltukYerleri);

        System.out.println(rezervasyon.toString());
    }
}
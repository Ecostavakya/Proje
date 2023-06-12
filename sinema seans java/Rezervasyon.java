public class Rezervasyon {
    public Seans seans;
    public String musteriAdSoyad;
    public int biletAdedi;
    public String[] koltuklar;

    public Rezervasyon(Seans seans, String musteriAdSoyad, int biletAdedi, String[] koltuklar) {
        this.seans = seans;
        this.musteriAdSoyad = musteriAdSoyad;
        this.biletAdedi = biletAdedi;
        this.koltuklar = koltuklar;
    }

    
    public String toString() {
        StringBuilder koltukStr = new StringBuilder();
        for (int i = 0; i < koltuklar.length; i++) {
            if (koltuklar[i] != null && !koltuklar[i].isEmpty()) {
                if (i > 0)
                    koltukStr.append(", ");
                koltukStr.append(koltuklar[i]);
            }
        }
        return "\n\nBilet\n"
                + "Film Adı: " + seans.getFilm().getFilmAdi() + "\n"
                + "Film Süresi: " + seans.getFilm().getSeansSaati() + " dk\n"
                + "Müşteri Ad Soyad: " + musteriAdSoyad + "\n"
                + "Salon: " + seans.getSalon().getSalonAdi() + "\n"
                + "Bilet adet: " + biletAdedi + "\n"
                + "Koltuklar: " + koltukStr.toString();
    }
}

public class Salon {
    public String salonAdi;
    public int salonKapasitesi;

    public Salon(String Ad, int Kapasitesi) {
        salonAdi = Ad;
        salonKapasitesi = Kapasitesi;
    }

    public String getSalonAdi() {
        return salonAdi;
    }

    public void setSalonAdi(String salonAdi) {
        this.salonAdi = salonAdi;
    }

    public int getSalonKapasitesi() {
        return salonKapasitesi;
    }

    public void setSalonKapasitesi(int salonKapasitesi) {
        this.salonKapasitesi = salonKapasitesi;
    }
}

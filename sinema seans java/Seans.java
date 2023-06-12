public class Seans {
    public Film film;
    public Salon salon;
    public String tarih;

    public Seans(Film film, Salon salon, String tarih) {
        this.film = film;
        this.salon = salon;
        this.tarih = tarih;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSeansString() {
        return film.getFilmAdi() + " - " + salon.getSalonAdi() + " - " + film.getSeansSaati() + " - " + tarih;
    }
}

public class Film {
    public String filmAdi;
    public String seansSaati;

    public Film(String ad, String saat) {
        filmAdi = ad;
        seansSaati = saat;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getSeansSaati() {
        return seansSaati;
    }

    public void setSeansSaati(String seansSaati) {
        this.seansSaati = seansSaati;
    }
}

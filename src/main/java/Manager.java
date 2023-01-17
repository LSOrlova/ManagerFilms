public class Manager {
    private String[] films = new String[0];
    public void addFilm(String film) {
        String[] tmp = new String[films.length +1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {

    }

}

public class FilmsRepository {
    private filmItem[] films = new filmItem[0];

    public void save(filmItem item) {
        filmItem[] tmp = new filmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;
    }
    public filmItem[] findAll() {
        return films;
    }

    public void findById(int id) {
        filmItem[] tmp = new filmItem[films.length - 1];
        for (filmItem film : films) {
            if (film.getId() = id) {
                return filmItem[];
            }
        }

    }
    public void removeById(int id) {
        filmItem[] tmp = new filmItem[films.length - 1];
        int copyToIndex = 0;
        for (filmItem film : films) {
            if(film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        filmItem[] tmp = new filmItem[films.length];
        int copyToIndex = 0;
        for (filmItem film : films) {
            tmp[copyToIndex] = null;
            copyToIndex++;
        }
        films = tmp;
    }
}

public class FilmManager {
    private FilmsRepository repo;

    public FilmManager(FilmsRepository repo) {
        this.repo = repo;
    }

    public void add(filmItem film) {
        repo.save(film);
    }
    public filmItem[] getFilms() {
        filmItem[] all = repo.findAll();
        return all;
    }

}

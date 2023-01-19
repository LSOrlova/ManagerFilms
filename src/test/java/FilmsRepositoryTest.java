import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsRepositoryTest {
    filmItem film1 = new filmItem("film1", 1);
    filmItem film2 = new filmItem("film2", 2);
    filmItem film3 = new filmItem("film3", 3);
    filmItem film4 = new filmItem("film4", 4);
    filmItem film5 = new filmItem("film5", 5);
    filmItem film6 = new filmItem("film6", 6);

    @Test
    public void testSave() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.findAll();

        filmItem[] expected = {film1, film2, film3};
        filmItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindById() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.findById(3);

        filmItem expected = film3;
        filmItem actual = repo.findById(3);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testRemoveById() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(film2.getId());

        filmItem[] expected = {film1, film3};
        filmItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testRemoveAll() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeAll();

        filmItem[] expected = {null, null,null};
        filmItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    String film1 = "Film1";
    String film2 = "Film2";
    String film3 = "Film3";
    @Test
    public void testShouldAddFilms() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldGetLast() {
        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }
}
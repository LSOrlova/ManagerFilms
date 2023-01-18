import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    String film1 = "Film1";
    String film2 = "Film2";
    String film3 = "Film3";
    String film4 = "Film4";
    String film5 = "Film5";
    String film6 = "Film6";

    @Test
    public void testShouldAddFilms() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);


        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldGetLastEqualsLimit() {
        Manager manager = new Manager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShouldGetLastUpperLimit() {
        Manager manager = new Manager(15);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShouldGetLastUnderLimit() {
        Manager manager = new Manager(2);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2};

        Assertions.assertArrayEquals(expected, actual);

    }
}
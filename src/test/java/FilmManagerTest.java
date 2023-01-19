import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class FilmManagerTest {
    filmItem film1 = new filmItem("film1", 1);
    filmItem film2 = new filmItem("film2", 2);
    filmItem film3 = new filmItem("film3", 3);
    filmItem film4 = new filmItem("film4", 4);
    filmItem film5 = new filmItem("film5", 5);
    filmItem film6 = new filmItem("film6", 6);
    FilmsRepository repo = Mockito.mock(FilmsRepository.class);
    FilmManager manager = new FilmManager(repo);

//    @BeforeEach
//    public void setup() {
//        manager.add(film1);
//        manager.add(film2);
//        manager.add(film3);
//    }

    @Test
    public void shouldShowAllFilms() {
        filmItem[] films = {film1, film2, film3};
        doReturn(films).when(repo).findAll();
        filmItem[] expected = {film1, film2, film3};
        filmItem[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
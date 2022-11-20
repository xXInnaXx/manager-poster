package ru.netology.managerposter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerAfishaUnitTest {

    private static final String BRIGADA = "BRIGADA";
    private static final String SECOND = BRIGADA + 2;
    private static final String THIRD = BRIGADA + 3;
    private static final String FOURTH = BRIGADA + 4;

    @Test
    void shouldReturnLastThreeFromTen() {
        ManagerAfisha managerAfisha = new ManagerAfisha(3);

        managerAfisha.add(BRIGADA + 1);
        managerAfisha.add(SECOND);
        managerAfisha.add(THIRD);
        managerAfisha.add(FOURTH);

        String[] lastMovies = managerAfisha.findLast();
        assertArrayEquals(new String[]{FOURTH, THIRD, SECOND}, lastMovies);
    }

    @Test
    void shouldReturnAllIfCountMovieMoreThanAll() {
        ManagerAfisha managerAfisha = new ManagerAfisha();

        managerAfisha.add(BRIGADA);
        managerAfisha.add(SECOND);
        managerAfisha.add(THIRD);

        String[] lastMovies = managerAfisha.findLast();
        assertArrayEquals(new String[]{THIRD, SECOND, BRIGADA}, lastMovies);
    }

    @Test
    void shouldReturnAllMovies() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        managerAfisha.add(BRIGADA);

        String[] lastMovies = managerAfisha.findAll();
        assertArrayEquals(new String[]{BRIGADA}, lastMovies);
    }
}
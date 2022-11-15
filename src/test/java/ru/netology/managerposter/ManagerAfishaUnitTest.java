package ru.netology.managerposter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerAfishaUnitTest {

    @Test
    void shouldReturnLastThreeFromTen() {
        ManagerAfisha managerAfisha = new ManagerAfisha(3);
        for (int i = 0; i < 10; i++) {
            managerAfisha.add("BRIGADA" + i);
        }
        String[] lastMovies = managerAfisha.findLast();
        assertEquals(3, lastMovies.length);
    }
    @Test
    void shouldReturn10From20() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        for (int i = 0; i < 20; i++) {
            managerAfisha.add("BRIGADA" + i);
        }
        String[] lastMovies = managerAfisha.findLast();
        assertEquals(10, lastMovies.length);
    }
    @Test
    void shouldReturn0IfCountMovieMoreThanAll() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        for (int i = 0; i < 3; i++) {
            managerAfisha.add("BRIGADA" + i);
        }
        String[] lastMovies = managerAfisha.findLast();
        assertEquals(3, lastMovies.length);
    }
    @Test
    void shouldReturnAllMovies() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        for (int i = 0; i < 3; i++) {
            managerAfisha.add("BRIGADA" + i);
        }
        String[] lastMovies = managerAfisha.findAll();
        assertEquals(3, lastMovies.length);
    }
}
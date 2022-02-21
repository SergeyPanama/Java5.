package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @Test
    void calculate() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.countSquares(100, 200);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void count() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(200, 300);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void countRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(300, 400);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
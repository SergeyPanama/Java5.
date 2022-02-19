package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @Test
    void manySquares() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int actual = service.manySquares(200, 300);
        System.out.println(actual);
    }

    @Test
    void manySquares2() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.manySquares(200, 300);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
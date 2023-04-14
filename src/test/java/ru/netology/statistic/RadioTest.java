package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio1() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio3() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio5() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryRadio6() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeAddRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDownRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.reduceVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio rad = new Radio();

    @Test
    public void shouldSetStationInRangeDefault() {
        rad.setCurrentStation(4);
        int actual = rad.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationInRange() {
        Radio rad = new Radio(250);
        rad.setCurrentStation(165);
        int actual = rad.getCurrentStation();
        int expected = 165;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMinimum() {
        rad.setCurrentStation(0);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMaximumDefault() {
        rad.setCurrentStation(9);
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMaximumDefault() {
        rad.setCurrentStation(10);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMaximum() {
        Radio rad = new Radio(55);
        rad.setCurrentStation(54);
        int actual = rad.getCurrentStation();
        int expected = 54;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMaximum() {
        Radio rad = new Radio(100);
        rad.setCurrentStation(100);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderMinimum() {
        rad.setCurrentStation(-10);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInRange() {
        rad.setCurrentVolume(50);
        int actual = rad.getCurrentVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMaximum() {
        rad.setCurrentVolume(100);
        int actual = rad.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMinimum() {
        rad.setCurrentVolume(0);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverMaximum() {
        rad.setCurrentVolume(101);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMinimum() {
        rad.setCurrentVolume(-5);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationInRangeDefault() {
        rad.setCurrentStation(8);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationInRange() {
        Radio rad = new Radio(100);
        rad.setCurrentStation(98);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMinimum() {
        rad.setCurrentStation(0);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMaximumDefault() {
        rad.setCurrentStation(9);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMaximum() {
        Radio rad = new Radio(100);
        rad.setCurrentStation(99);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationInRangeDefault() {
        rad.setCurrentStation(1);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationInRange() {
        Radio rad = new Radio(70);
        rad.setCurrentStation(50);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMinimumDefault() {
        rad.setCurrentStation(0);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMinimum() {
        Radio rad = new Radio(75);
        rad.setCurrentStation(0);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 74;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMaximumDefault() {
        rad.setCurrentStation(9);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOverMaximumDefault() {
        rad.setCurrentStation(10);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMaximum() {
        Radio rad = new Radio(70);
        rad.setCurrentStation(69);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 68;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOverMaximum() {
        Radio rad = new Radio(80);
        rad.setCurrentStation(80);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 79;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInRange() {
        rad.setCurrentVolume(39);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 40;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMinimum() {
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMaximum() {
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInRange() {
        rad.setCurrentVolume(6);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMinimum() {
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMaximum() {
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }


}
package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void setStationInRange() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);
        int actual = rad.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void setStationOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setStationOnMaximum() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setStationOverMaximun() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setStationUnderMinimum() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int actual = rad.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeOnMaximum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeOverMaximum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUnderMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationInRange() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationOnMaximum() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationInRange() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationOnMaximum() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOnMaximum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void deacreaseVolumeOnMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);

    }

}








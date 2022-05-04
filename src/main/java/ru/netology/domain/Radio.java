package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int countOfStation = 10;
    private int maxStation = countOfStation - 1;

    public Radio() {
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
        this.maxStation = this.countOfStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation || currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100 || currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }
}
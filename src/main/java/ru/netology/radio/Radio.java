package ru.netology.radio;


public class Radio {
    private int volume;    // текущая громкость
    private int station;  // текущая станция

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;          // вернуть данные о громкости
    }

    public void setStation(int newStation) {      // установить станцию
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }

    public void nextStation() {     // следующая станция
        if (station < 9) {
            station = station + 1;
        } else {
            station = 0;
        }
    }

    public void prevStation() {        // предыдущая станция
        if (station > 0) {
            station = station - 1;
        } else {
            station = 9;
        }
    }

    public void setVolume(int newVolume) {     // установить громкость
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {       // увеличить громкость
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void turnDownTheVolume() {       // уменьшить громкость
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

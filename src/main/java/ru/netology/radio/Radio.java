package ru.netology.radio;


public class Radio {
    private int volume;    // текущая громкость
    private int station;  // текущая станция
    private int quantityStation = 10;  // кол-во станций
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        return;
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;          // вернуть данные о громкости
    }

    public void setStation(int newStation) {      // установить станцию
        if (newStation >= quantityStation) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }

    public void nextStation() {     // следующая станция
        if (station < quantityStation - 1) {
            station = station + 1;
        } else {
            station = 0;
        }
    }

    public void prevStation() {        // предыдущая станция
        if (station > 0) {
            station = station - 1;
        } else {
            station = quantityStation - 1;
        }
    }

    public void setVolume(int newVolume) {     // установить громкость
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {       // увеличить громкость
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void turnDownTheVolume() {       // уменьшить громкость
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}

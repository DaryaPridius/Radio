package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {             // установить станцию
        Radio radio = new Radio();

        radio.setStation(7);

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldToSelectStationAboveTheLimit() {
        Radio radio = new Radio();

        radio.setStation(11);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldToSelectStationBelowTheLimit() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void selectTheNextStation() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.NextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void selectTheNextStationAfterTheMax() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.NextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectThePrevStation() {
        Radio radio = new Radio();

        radio.setStation(7);
        radio.PrevStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectThePrevStationAfterTheMin() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.PrevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolume() {
        Radio radio = new Radio();

        radio.setVolume(77);
        radio.increaseVolume();

        int expected = 78;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeAboveTheMax() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnDownTheVolume() {
        Radio radio = new Radio();

        radio.setVolume(68);
        radio.turnDownTheVolume();

        int expected = 67;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolumeLessTheMin() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.turnDownTheVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setTheVolumeAbove100() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setTheVolumeLess0() {
        Radio radio = new Radio();

        radio.setVolume(-2);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}

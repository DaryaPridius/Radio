package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setTheStationToTheDefaultValue() {             // установить станцию

        radio.setStation(7);

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumberOfStation() {
        Radio radio = new Radio(30);

        radio.setStation(20);

        int expected = 20;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldToSelectStationAboveTheLimit() {
        Radio radio = new Radio(30);

        radio.setStation(30);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldToSelectStationBelowTheLimit() {

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void selectTheNextStation() {

        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void selectTheNextStationAfterTheMax() {

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectThePrevStation() {

        radio.setStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectThePrevStationAfterTheMin() {

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseTheVolume() {

        radio.setVolume(77);
        radio.increaseVolume();

        int expected = 78;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeAboveTheMax() {

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnDownTheVolume() {

        radio.setVolume(68);
        radio.turnDownTheVolume();

        int expected = 67;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolumeLessTheMin() {

        radio.setVolume(0);
        radio.turnDownTheVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setTheVolumeAbove100() {

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setTheVolumeLess0() {

        radio.setVolume(-2);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}

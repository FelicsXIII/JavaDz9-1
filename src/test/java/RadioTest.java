import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    // тест текущий номер станции
    public void shouldCurrentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест текущий номер станции с установленным кол-вом станций
    public void shouldCurrentNumberModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест больше макс номера станции
    public void shouldCurrentNumberMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(10);

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест больше макс номера станции с установленным кол-вом станций
    public void shouldCurrentNumberMoreMaxModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(30);

        int expected = 29;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест мееньше мин номер станции
    public void shouldCurrentNumberLessMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест меньше мин номер станции с установленным кол-вом станций
    public void shouldCurrentNumberLessMinModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест следующей станции
    public void shouldNextNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(5);
        radio.nextNumberRadioStation();

        int expected = 6;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест следующей станции с установленным кол-вом станций
    public void shouldNextNumberRadioStationModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(15);
        radio.nextNumberRadioStation();

        int expected = 16;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест следующей станции
    public void shouldNextNumberRadioStationIfMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(9);
        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест следующей станции с установленным кол-вом станций
    public void shouldNextNumberRadioStationIfMaxModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(29);
        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест предыдущей станции
    public void shouldPrevNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(5);
        radio.prevNumberRadioStation();

        int expected = 4;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест предыдущей станции с установленным кол-вом станций
    public void shouldPrevNumberRadioStationModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(15);
        radio.prevNumberRadioStation();

        int expected = 14;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест предыдущей станции
    public void shouldPrevNumberRadioStationIfMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // тест предыдущей станции с установленным кол-вом станций
    public void shouldPrevNumberRadioStationIfMinModRadio() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumberRadioStation();

        int expected = 29;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCurrentSoundVolume() { // тест текущий громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCurrentSoundVolumeMoreMax() { // тест текущий громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCurrentSoundVolumeLessMin() { // тест текущий громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseSoundVolume() { // тест увеличения громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseSoundVolumeMax() { // тест увеличения громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseSoundVolume() { // тест уменьшения громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseSoundVolumeMin() { // тест уменьшения громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
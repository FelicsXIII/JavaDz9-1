import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldCurrentNumber() { // тест текущий номер станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCurrentNumberMoreMax() { // тест текущий номер станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(10);

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCurrentNumberLessMin() { // тест текущий номер станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextNumberRadioStation() { // тест следующей станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(8);
        radio.nextNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextNumberRadioStationIfMax() { // тест следующей станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(9);
        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevNumberRadioStation() { // тест предыдущей станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(5);
        radio.prevNumberRadioStation();

        int expected = 4;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevNumberRadioStationIfMin() { // тест предыдущей станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumberRadioStation();

        int expected = 9;
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
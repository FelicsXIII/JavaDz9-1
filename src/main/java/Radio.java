public class Radio {

    private int currentNumberRadioStation; // текущая станция

    private int currentSoundVolume; // текущая громкость

    private int setMaxNumberRadioStation() {
        currentNumberRadioStation = 9; // макс номер станции
        return currentNumberRadioStation;
    }

    private int setMinNumberRadioStation() {
        currentNumberRadioStation = 0; // мин номер станции
        return currentNumberRadioStation;
    }

    private int setMinSoundVolume() {
        currentSoundVolume = 0; // мин громкость 0
        return currentSoundVolume;
    }

    private int setMaxSoundVolume() {
        currentSoundVolume = 100; // макс громкость 100
        return currentSoundVolume;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation > 9) {
            newCurrentNumberRadioStation = setMaxNumberRadioStation();
        }
        if (newCurrentNumberRadioStation < 0) {
            newCurrentNumberRadioStation = setMinNumberRadioStation();
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume > 100) {
            newCurrentSoundVolume = setMaxSoundVolume();
        }
        if (newCurrentSoundVolume < 0) {
            newCurrentSoundVolume = setMinSoundVolume();
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void nextNumberRadioStation() { //увеличение номера радиостанции
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation++; // если меньше 9 то +1
        } else {
            currentNumberRadioStation = setMinNumberRadioStation(); // если 9 то мин номер
        }
    }

    public void prevNumberRadioStation() { //уменьшение номера радиостанции
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation--; // если меньше 0 то -1
        } else {
            currentNumberRadioStation = setMaxNumberRadioStation(); // если 0 то макс номер
        }
    }

    public void increaseVolume() { //увеличение громкости звука
        if (currentSoundVolume < 100) {
            currentSoundVolume++; // если меньше 100 то +1
        }
        if (currentSoundVolume == 100) {
            currentSoundVolume = setMaxSoundVolume(); // если 100 то макс громкость
        }
    }

    public void decreaseVolume() {  // уменьшение громкости звука
        if (currentSoundVolume <= 0) {
            currentSoundVolume = setMinSoundVolume(); // если меньше или равно 0 = мин громкость
        }
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}

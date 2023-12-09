public class Radio {

    private int currentNumberRadioStation; // текущая станция
    private int currentSoundVolume; // текущая громкость
    private int maxNumberRadioStation; // мин станция
    private int minNumberRadioStation; // макс станция

    public Radio() { // 10 станций
        this.maxNumberRadioStation = 9;
        this.minNumberRadioStation = 0;
    }

    public Radio(int count) { // любое кол-во станций
        this.maxNumberRadioStation = count - 1;
        this.minNumberRadioStation = 0;
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
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            newCurrentNumberRadioStation = maxNumberRadioStation;
        }
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            newCurrentNumberRadioStation = minNumberRadioStation;
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
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation++; // если меньше 9 то +1
        } else {
            currentNumberRadioStation = minNumberRadioStation; // если 9 то мин номер
        }
    }

    public void prevNumberRadioStation() { //уменьшение номера радиостанции
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation--; // если меньше 0 то -1
        } else {
            currentNumberRadioStation = maxNumberRadioStation; // если 0 то макс номер
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

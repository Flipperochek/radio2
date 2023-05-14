public class Radio {

    private int chanel;
    private int currentVolume;

    public void next() {
        if (chanel < 9) {
            chanel++;
        } else {
            chanel = 0;
        }
    }

    public void prev() {
        if (chanel > 0) {
            chanel--;
        } else {
            chanel = 9;
        }

    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        if (0 <= chanel && chanel <= 9) {
            this.chanel = chanel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
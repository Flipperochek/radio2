import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void nextFromZero() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 1;

        // вызываем целевой метод:
        radio.next();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void nextFromMiddleValue() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 6;
        radio.setChanel(5);

        // вызываем целевой метод:
        radio.next();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void nextFromMaxValue() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 0;
        radio.setChanel(9);

        // вызываем целевой метод:
        radio.next();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void prevFromZero() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 9;

        // вызываем целевой метод:
        radio.prev();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void prevFromMiddleValue() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 4;
        radio.setChanel(5);

        // вызываем целевой метод:
        radio.prev();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void prevFromMaxValue() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 8;
        radio.setChanel(9);

        // вызываем целевой метод:
        radio.prev();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void setChanelNegative() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 0;

        // вызываем целевой метод:
        radio.setChanel(-1);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void setChanelMoreThanMax() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 0;

        // вызываем целевой метод:
        radio.setChanel(11);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void setChanelNeutrale() {
        Radio radio = new Radio();

        // подготавливаем данные:
        int expected = 5;

        // вызываем целевой метод:
        radio.setChanel(5);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, radio.getChanel());
    }

    @Test
    void increaseVolumeFromZero() {
        Radio radio = new Radio();

        int expected = 1;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxValue() {
        Radio radio = new Radio();

        int expected = 10;
        for (int i = 0; i < 10; i++) {
            radio.increaseVolume();
        }
        assertEquals(expected, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void decreaseVolumeValue() {
        Radio radio = new Radio();

        int expected = 0;
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeZeroValue() {
        Radio radio = new Radio();

        int expected = 0;

        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}
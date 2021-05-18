package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldRadioChannelNumber() {

        radio.setCurrentRadioChannel(5);
        assertEquals(5, radio.getCurrentRadioChannel());
    }

    @Test   // Тест переключения следующего радиоканала
    public void shouldNextRadioChannel() {

        radio.setCurrentRadioChannel(5);
        radio.nextCurrentRadioChannel();
        assertEquals(6, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения предыдущего радиоканала
    public void shouldPrevaRadioChannel() {

        radio.setCurrentRadioChannel(5);
        radio.prevCurrentRadioChannel();
        assertEquals(4, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения радиоканала с 10 на 0
    public void shouldNextMaxRadioChannel() {

        radio.setCurrentRadioChannel(10);
        radio.nextCurrentRadioChannel();
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения радиоканала с 0 на 10
    public void shouldPrevMinRadioChannel() {

        radio.setCurrentRadioChannel(0);
        radio.prevCurrentRadioChannel();
        assertEquals(10, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значеий
    public void shouldRemoteMaxRadioChannel() {

        radio.setCurrentRadioChannel(5);
        radio.remoteCurrentRadioChannel(11);
        assertEquals(9, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMinRadioChannel() {

        radio.setCurrentRadioChannel(5);
        radio.remoteCurrentRadioChannel(-1);
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test // Тест увеличения громкости звука (+)
    public void shouldNextVolume() {

        radio.setCurrentVolume(50);
        radio.nextCurrentVolume();
        assertEquals(60, radio.getCurrentVolume());
    }

    @Test // Тест уменьшения громкости звука (-)
    public void shoulPrevVolume() {

        radio.setCurrentVolume(50);
        radio.prevCurrentVolume();
        assertEquals(40, radio.getCurrentVolume());
    }

    @Test // Тест max громкость звука
    public void shouldMaxVolume() {

        radio.setCurrentVolume(50);
        radio.prevCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test // Тест min громкость звука
    public void shouldMinVolume() {

        radio.setCurrentVolume(50);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMaxValue() {

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMinValue() {

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
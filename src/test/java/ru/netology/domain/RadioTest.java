package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public void shouldCreate() {

        Radio radio = new Radio();
    }

    @Test // Тестируем громкость максимум и минимум
    public void shouldInitFieldToZeroTenVolume() {
        Radio radio = new Radio();

        assertNull(radio.name);
        assertEquals(10, radio.maxVolume);
        assertEquals(0, radio.minVolume);
        assertEquals(5, radio.currentVolume);
        radio.currentVolume = 3;
    }


    @Test //Тестируем радио канал от 1 до 9
    public void shouldInitFieldTo() {
        Radio radio = new Radio();

        assertNull(radio.name);
        assertEquals(9, radio.maxRadioChannel);
        assertEquals(1, radio.minRadioChannel);
        assertEquals(5, radio.currentRadioChannel);
        radio.currentRadioChannel = 5;

    }
}
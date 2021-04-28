package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public void shouldCreate() {

        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroTenVolume() {
        Radio radio = new Radio();

        assertNull(radio.name);
        assertEquals(10, radio.maxVolume);
        assertEquals(0, radio.minVolume);
        assertEquals(5, radio.currentVolume);
        radio.currentVolume = 5;
        assertFalse(radio.on);
    }

    // Спрятан по причине NPE
    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldInitFieldTo() {
        Radio radio = new Radio();

        assertNull(radio.name);
        assertEquals(9, radio.maxRadioChannel);
        assertEquals(1, radio.minRadioChannel);
        assertEquals(5, radio.currentRadioChannel);
        radio.currentRadioChannel = 5;

    }
}
package ru.netology.domain;

public class Radio {
    String name;
    int maxVolume = 10;  //Максимальный звук
    int minVolume = 0; //Минимальный звук
    int currentVolume = 5; //Текущий звук
    int maxRadioChannel = 9; //Максимальный радио канал
    int minRadioChannel = 1; //Минимальный радио канал
    int currentRadioChannel = 5; //Текущий радио канал
    boolean on; // Включен\Выключен
}

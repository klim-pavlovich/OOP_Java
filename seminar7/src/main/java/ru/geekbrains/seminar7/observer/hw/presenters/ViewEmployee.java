package ru.geekbrains.seminar7.observer.hw.presenters;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;

public interface ViewEmployee {
    boolean receiveOffer(Vacancy vacancy);
}

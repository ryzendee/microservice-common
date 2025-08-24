package ryzendee.app.common.api;

import ryzendee.app.common.enums.EventType;

/**
 * Базовый интерфейс для всех событий.
 *
 * Определяет минимальный контракт, который обязана реализовать
 * любая модель события в системе.
 *
 * @author Dmitry Ryazantsev
 */
public interface Event {

    /**
     * Возвращает тип события.
     *
     * @return {@link EventType} — тип события
     */
    EventType getEventType();
}

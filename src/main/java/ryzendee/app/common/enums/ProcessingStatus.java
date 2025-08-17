package ryzendee.app.common.enums;

/**
 * Универсальный статус обработки для асинхронных процессов.
 *
 * Используется для фиксации результата выполнения операций.
 *
 * @author Dmitry Ryazantsev
 */
public enum ProcessingStatus {

    PROCESSED,
    FAILED,
    PENDING
}

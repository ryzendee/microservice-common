package ryzendee.app.common.exception;

/**
 * Исключение, сигнализирующее о проблемах при маппинге данных между объектами
 *
 * Обычно выбрасывается, если конвертация данных невозможна
 * или произошла ошибка во время трансформации.
 *
 * @author Dmitry Ryazantsev
 */
public class MappingException extends RuntimeException {

    public MappingException(Throwable cause) {
        super(cause);
    }

    public MappingException(String message, Throwable cause) {
        super(message, cause);
    }
}

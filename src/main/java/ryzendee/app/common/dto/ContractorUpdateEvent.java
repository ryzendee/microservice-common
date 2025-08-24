package ryzendee.app.common.dto;

import ryzendee.app.common.api.Event;
import ryzendee.app.common.enums.EventType;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static java.util.UUID.randomUUID;

/**
 * Событие обновления информации о контрагенте.
 *
 * Используется в механизмах обмена событиями для фиксации факта изменения данных контрагента.
 *
 * @author Dmitry Ryazantsev
 */
public class ContractorUpdateEvent implements Event {

    private UUID eventId;
    private String contractorId;
    private String inn;
    private String name;
    private LocalDateTime createDate;
    private EventType eventType = EventType.CONTRACTOR_UPDATE;

    public ContractorUpdateEvent() {
    }

    public ContractorUpdateEvent(UUID eventId, String contractorId, String inn, String name, LocalDateTime createDate, EventType eventType) {
        this.eventId = eventId;
        this.contractorId = contractorId;
        this.inn = inn;
        this.name = name;
        this.createDate = createDate;
        this.eventType = eventType;
    }

    public ContractorUpdateEvent(String contractorId, String inn, String name, LocalDateTime createDate) {
        this.eventId = randomUUID();
        this.contractorId = contractorId;
        this.inn = inn;
        this.name = name;
        this.createDate = createDate;
    }

    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        ContractorUpdateEvent event = (ContractorUpdateEvent) object;

        if (!Objects.equals(eventId, event.eventId)) return false;
        if (!Objects.equals(contractorId, event.contractorId)) return false;
        if (!Objects.equals(inn, event.inn)) return false;
        if (!Objects.equals(name, event.name)) return false;
        if (!Objects.equals(createDate, event.createDate)) return false;
        return eventType == event.eventType;
    }

    @Override
    public int hashCode() {
        int result = eventId != null ? eventId.hashCode() : 0;
        result = 31 * result + (contractorId != null ? contractorId.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        return result;
    }
}

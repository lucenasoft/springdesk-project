package br.com.lucenasoft.helpdesk.models;

import br.com.lucenasoft.helpdesk.Enums.PriorityEnum;
import br.com.lucenasoft.helpdesk.Enums.StatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CalledModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate openingData = LocalDate.now();
    private LocalDate closingData;
    private String obs;
    private StatusEnum status;
    private PriorityEnum priority;

    public CalledModel() {}

    public CalledModel(Long id, String title, LocalDate openingData, LocalDate closingData, String obs, StatusEnum status, PriorityEnum priority) {
        this.id = id;
        this.title = title;
        this.openingData = openingData;
        this.closingData = closingData;
        this.obs = obs;
        this.status = status;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getOpeningData() {
        return openingData;
    }

    public void setOpeningData(LocalDate openingData) {
        this.openingData = openingData;
    }

    public LocalDate getClosingData() {
        return closingData;
    }

    public void setClosingData(LocalDate closingData) {
        this.closingData = closingData;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }
}

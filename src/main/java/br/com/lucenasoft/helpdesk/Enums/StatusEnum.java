package br.com.lucenasoft.helpdesk.Enums;

public enum StatusEnum {
    OPEN("Open"),
    PROGRESS("Progress"),
    CLOSED("Closed");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

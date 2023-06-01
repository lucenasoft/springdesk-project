package br.com.lucenasoft.helpdesk.Enums;

public enum PriorityEnum {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private String priority;

    private PriorityEnum(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

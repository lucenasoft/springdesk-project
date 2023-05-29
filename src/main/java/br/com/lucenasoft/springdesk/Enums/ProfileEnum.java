package br.com.lucenasoft.springdesk.Enums;

public enum ProfileEnum {
    ADMIN("Administrator"),
    TEC("Technician"),
    CLIENT("Client");

    private String profile;

    private ProfileEnum(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

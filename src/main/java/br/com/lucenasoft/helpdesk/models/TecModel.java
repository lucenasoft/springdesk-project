package br.com.lucenasoft.helpdesk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tecs")
public class TecModel extends PersonAbstract {

    @OneToMany
    private List<CalledModel> calleds = new ArrayList<>();

    public List<CalledModel> getCalleds() {
        return calleds;
    }

    public void setCalleds(List<CalledModel> calleds) {
        this.calleds = calleds;
    }
}

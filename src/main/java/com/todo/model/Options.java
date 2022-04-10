package com.todo.model;

import javax.persistence.Entity;

public class Options {
    private Boolean chaos, guardian, daily, weekly, chaosGate;

    public Boolean getChaos() {
        return chaos;
    }

    public void setChaos(Boolean chaos) {
        this.chaos = chaos;
    }

    public Boolean getChaosGate() {
        return chaosGate;
    }

    public void setChaosGate(Boolean chaosGate) {
        this.chaosGate = chaosGate;
    }

    public Boolean getDaily() {
        return daily;
    }

    public void setDaily(Boolean daily) {
        this.daily = daily;
    }

    public Boolean getGuardian() {
        return guardian;
    }

    public void setGuardian(Boolean guardian) {
        this.guardian = guardian;
    }

    public Boolean getWeekly() {
        return weekly;
    }

    public void setWeekly(Boolean weekly) {
        this.weekly = weekly;
    }
}

package com.example.demo;

import java.time.LocalDate;

public class CurrentOrganization {
    private LocalDate startDate;
    private boolean isWorking;

    // Getters & Setters
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}

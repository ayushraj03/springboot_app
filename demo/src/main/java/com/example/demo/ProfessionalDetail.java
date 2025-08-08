package com.example.demo;

import java.util.List;

public class ProfessionalDetail {
    private CurrentOrganization currentOrganization;
    private List<String> skills;

    // Getters & Setters
    public CurrentOrganization getCurrentOrganization() {
        return currentOrganization;
    }

    public void setCurrentOrganization(CurrentOrganization currentOrganization) {
        this.currentOrganization = currentOrganization;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}

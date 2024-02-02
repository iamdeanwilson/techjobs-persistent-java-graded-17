package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 1000)
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

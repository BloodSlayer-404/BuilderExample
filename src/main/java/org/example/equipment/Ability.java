package org.example.equipment;

public class Ability {
    private String abilityName;
    private String description;
    private int cooldown;

    public Ability(String abilityName, String description, int cooldown) {
        this.abilityName = abilityName;
        this.description = description;
        this.cooldown = cooldown;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "abilityName='" + abilityName + '\'' +
                ", description='" + description + '\'' +
                ", cooldown=" + cooldown +
                '}';
    }
}

package com.swingy.Model;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class Hero {
    private int id;

    @NotNull(message = "Hero name cannot be null")
    private String name;

    @NotNull(message = "Hero type cannot be null")
    private HeroType heroType;

    @NotNull(message = "Position cannot be null")
    private Position position;

    @NotNull(message = "Stats cannot be null")
    private Stats stats;

    private List<Artifact> artifacts;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }
}

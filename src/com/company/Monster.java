package com.company;

public class Monster {
    private String food;
    private String habitat;
    private String attackWeapons;

    public void setFood(String food) {
        this.food = food;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAttackWeapons(String attackWeapons) {
        this.attackWeapons = attackWeapons;
    }
    public void whoAmI(){
        System.out.println("I am a " + food +". I live " + habitat +". I attack with my " + attackWeapons +".");
    }
}

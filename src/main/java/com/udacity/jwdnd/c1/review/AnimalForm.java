package com.udacity.jwdnd.c1.review;

public class AnimalForm {

    private String animalName;

    private String adjective;

    public AnimalForm(String animalName, String adjective) {
        this.animalName = animalName;
        this.adjective = adjective;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return "AnimalForm [animalName=" + animalName + ", adjective=" + adjective + "]";
    }


    
}

package com.udacity.jwdnd.c1.review;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class MessageListService {


    private List<String> messages;

    private List<AnimalForm> animals;

    public  List<AnimalForm> getAnimals() {
        return animals;
    }

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
        this.animals = new ArrayList<>();
    }


    public List<String> getMessages(){
        return messages;
    }

    public void addMessage(String message){
        this.messages.add(message);
    }

    public void addAnimal(AnimalForm animal){
        this.animals.add(animal);
    }

    
}

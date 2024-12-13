package com.udacity.jwdnd.c1.review;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class MessageListService {


    private List<String> messages;

    private List<AnimalForm> animals;

    
    private List<ChatMessage> chats;

    public  List<AnimalForm> getAnimals() {
        return animals;
    }

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.chats = new ArrayList<>();
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

    public void addChat(ChatMessage chatForm, String mode){

        ChatMessage chat = new ChatMessage();


        if(chatForm != null){
            chat.setUsername(chatForm.getUsername());

            switch (mode) {

                case "Shout":
    
                    chat.setMessage(chatForm.getMessage().toUpperCase());
                    break;
    
                case "Whisper":
                    
                    chat.setMessage(chatForm.getMessage().toLowerCase());
                    break;
            
                default:
                    break;
            }
    

        }

        chats.add(chat);
    }

    public List<ChatMessage> getChats(){
        return chats;
    }

    
}

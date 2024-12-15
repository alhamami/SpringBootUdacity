package com.udacity.jwdnd.c1.review.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udacity.jwdnd.c1.review.Model.ChatMessage;

import jakarta.annotation.PostConstruct;

@Service
public class MessageService {

    private List<ChatMessage> chats;

    @PostConstruct
    public void postConstruct(){
        chats = new ArrayList<>();
    }



    public void addChat(ChatMessage chatForm, String mode){

        ChatMessage chat = new ChatMessage();


        if(chatForm != null){
            chat.setUsername(chatForm.getUsername());

            mode = mode.toLowerCase();
            switch (mode) {

                case "say":

                    chat.setMessage(chatForm.getMessage());
                    break;

                case "shout":
    
                    chat.setMessage(chatForm.getMessage().toUpperCase());
                    break;
    
                case "whisper":
                    
                    chat.setMessage(chatForm.getMessage().toLowerCase());
                    break;
            
                default:
                    break;
            }

            chats.add(chat);

        }

    
    }


    public List<ChatMessage> getChats(){
        return chats;
    }




    
}

package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {


    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/chat")
    public String chatPage(@ModelAttribute("newChat") ChatForm newChat, Model model){

        model.addAttribute("chats",   messageService.getChats());

        return "chat";
    }


    @PostMapping("/chat")
    public String newChat(@ModelAttribute("newChat") ChatForm newChat, Model model){


        messageService.addChat(newChat.getChatMessage(), newChat.getMode());

        model.addAttribute("chats",   messageService.getChats());

        
        newChat.setChatMessage(null);
        newChat.setMode("");
        
        return "chat";
    }
    
}

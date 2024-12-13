package com.udacity.jwdnd.c1.review;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



    private MessageListService messageListService;

    public HomeController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }


    @RequestMapping("/home")
    public String home(Model model){

        String [] greetings = {"Hello", "Hey", "GoodBye"};

        model.addAttribute("greetings", greetings);

        return "simple-home";
    }


    @RequestMapping("/simplehome")
    public String homepage(Model model){

        model.addAttribute("firstVisit", true);

        
        return "simple-home";
    }



    @GetMapping("/form")
    public String getForm(@ModelAttribute("newMessage") MessageForm newMessageForm, Model model){

        model.addAttribute("greetings", messageListService.getMessages());

        return "form-home";
    }

    @PostMapping("/form")
    public String postForm(@ModelAttribute("newMessage") MessageForm messageForm, Model model){

        messageListService.addMessage(messageForm.getText());

        model.addAttribute("greetings", messageListService.getMessages());

        messageForm.setText("");

        return "form-home";
    }


    @GetMapping("/animal")
    public String getAnimal(@ModelAttribute("animalForm") AnimalForm animalForm, Model model){


        model.addAttribute("greetings", messageListService.getAnimals());

        return "animal";
    }


    @PostMapping("/animal")
    public String postAnimal(@ModelAttribute("animalForm") AnimalForm animalForm, Model model){

        messageListService.addAnimal(animalForm);

        List<AnimalForm> animals = messageListService.getAnimals();

        model.addAttribute("greet ings", animals);
        
        animalForm.setAnimalName("");
        animalForm.setAdjective("");

        return "animal";
    }

}
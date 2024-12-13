package com.udacity.jwdnd.c1.review.Model;

public class ChatForm {

    @Override
    public String toString() {
        return "ChatForm [mode=" + mode + ", chatMessage=" + chatMessage + "]";
    }
    private String mode;
    private ChatMessage chatMessage;


    public ChatMessage getChatMessage() {
        return chatMessage;
    }
    public void setChatMessage(ChatMessage chatMessage) {
        this.chatMessage = chatMessage;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    
}

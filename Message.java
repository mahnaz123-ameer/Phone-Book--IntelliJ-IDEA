package com.company;


import java.time.LocalDateTime;

public class Message {

    private  String text;
    private LocalDateTime dateTime;

    public Message(String text, LocalDateTime dateTime) {
        this.text = text;
        this.dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void senttext(

    )

}

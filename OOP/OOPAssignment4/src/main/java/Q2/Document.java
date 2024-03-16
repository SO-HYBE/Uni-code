/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Date;


/**
 *
 * @author sohai
 */
class Document {
    private String[] authors = new String[3];
    private int numAuthors;
    private Date date = new Date();

    public Document(int maxAuthors) {
        authors = new String[maxAuthors];
        numAuthors = 0;
    }
    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }
    

    public void addAuthor(String name) {
        if (numAuthors < authors.length) {
            authors[numAuthors] = name;
            numAuthors++;
        } else {
            System.out.println("Cannot add more authors. Maximum capacity reached.");
        }
    }

}

class Book extends Document{
    private String title;
    
    public Book (int maxAuthors, String title){
        super(maxAuthors);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
}

class Email extends Document{
    private String subject;
    private String to;
    
    public Email (int maxAuthors, String subject, String to){
        super(maxAuthors);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }
    
}
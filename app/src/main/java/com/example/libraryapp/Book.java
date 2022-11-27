package com.example.libraryapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="book")
public class Book {
    @PrimaryKey(autoGenerate=true)
    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public int getid(){
        return id;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public void setid(int id){
        this.id=id;
    }
    public void settitle(String title){
        this.title=title;
    }
    public void setauthor(String author){
        this.author=author;
    }
}

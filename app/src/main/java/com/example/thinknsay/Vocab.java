package com.example.thinknsay;

public class Vocab {
    int id;
    String nameWord;
    String category;

    public Vocab(int id, String nameWord, String category) {
        this.id = id;
        this.nameWord = nameWord;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameWord() {
        return nameWord;
    }

    public void setNameWord(String nameWord) {
        this.nameWord = nameWord;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

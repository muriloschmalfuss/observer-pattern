package org.schmalfuss;

public class Store extends Subject{
    private String content;

    public void publishNewContent(String content) {
        this.content = content;
        notifyObservers();
    }

    public String getState() {
        return this.content;
    }
}

package org.schmalfuss;

public class ClientPoor implements Observer{
    private String content;
    @Override
    public void update(Subject store) {
        this.content = (String) store.getState();
    }

    public void comment() {
        System.out.println("\nSou muito pobre para adquirir essa novidade:");
        System.out.println(content);
    }
}

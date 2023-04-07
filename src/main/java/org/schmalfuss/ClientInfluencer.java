package org.schmalfuss;

public class ClientInfluencer implements Observer{
    private String content;
    @Override
    public void update(Subject store) {
        this.content = (String) store.getState();
    }

    public void comment() {
        System.out.println("\nNovidade da loja, venham conferir:");
        System.out.println(content);
    }
}

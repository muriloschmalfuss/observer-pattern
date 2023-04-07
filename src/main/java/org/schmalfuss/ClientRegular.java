package org.schmalfuss;

public class ClientRegular implements Observer {
    private String content;
    @Override
    public void update(Subject store) {
        this.content = (String) store.getState();
    }

    public void comment() {
        System.out.println("\nEu sempre compro todas as novidades dessa loja:");
        System.out.println(content);
    }
}

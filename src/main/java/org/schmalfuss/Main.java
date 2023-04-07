package org.schmalfuss;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        ClientInfluencer influencer = new ClientInfluencer();
        ClientPoor poor = new ClientPoor();
        ClientRegular regular = new ClientRegular();

        store.attach(influencer);
        store.attach(poor);
        store.attach(regular);

        store.publishNewContent("Novo jogo lançado por apenas R$ 399,00.");

        influencer.comment();
        poor.comment();
        regular.comment();
    }
}
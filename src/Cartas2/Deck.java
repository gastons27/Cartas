/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cartas2;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author gasto
 */
public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        cards = new ArrayList<Card>();
        String[] pPalo = {"Trebol", "Corazon", "Espada", "Diamante"};
        String[] cColor = {"negro", "rojo"};
        String[] vValor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        int count = 0;
        for (String palo : pPalo) {
            for (String color : cColor) {
                for (String valor : vValor) {
                    if (count < 52){
                    Card card = new Card(palo, color, valor);
                    cards.add(card);
                }
                    count ++;
            }
        }
    }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }
    
    public void head() {
        Card card = cards.get(0);
        cards.remove(0);
        System.out.println(card.getPalo() + "," + card.getColor() + "," + card.getValor());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }
    
    public void pick() {
        int index = (int) (Math.random() * cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        System.out.println(card.getPalo() + "," + card.getColor() + "," + card.getValor());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }
    
    public void hand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * cards.size());
            hand[i] = cards.get(index);
            cards.remove(index);
        }
        for (Card card : hand) {
            System.out.println(card.getPalo() + "," + card.getColor() + "," + card.getValor());
        }
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }
}

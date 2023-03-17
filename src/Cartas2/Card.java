/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartas2;

/**
 *
 * @author gasto
 */
public class Card {
    
    private String palo; 
    private String color; 
    private String valor; 

    public Card(String suit, String color, String value) {
        this.palo = suit;
        this.color = color;
        this.valor = value;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}

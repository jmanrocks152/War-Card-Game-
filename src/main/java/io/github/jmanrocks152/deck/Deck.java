package io.github.jmanrocks152.deck;

import java.util.ArrayList;

/**
 * Created by jmanrocks152 on 3/30/17.
 */
public class Deck {
    int deckNumber = 0;
    int suitNumber = 0;

    ArrayList<Integer> deck = new ArrayList<Integer>();

    {
        //The deck of cards, 1 being aces, etc
        for(int i = 0; i < 52; i++) {
            if(i % 4 == 0) {
                deckNumber++;
            }
            deck.add(deckNumber);
        }
    }

    ArrayList<Integer> suits = new ArrayList<Integer>();

    {
//List of all the suits, 13 spades, clubs, diamonds, and hearts
       for(int i = 0; i < 52; i++) {
           if(i % 13 == 0) {
               suitNumber++;
           }
           deck.add(suitNumber);
       }
    }



}
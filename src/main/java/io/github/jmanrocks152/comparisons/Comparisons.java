package io.github.jmanrocks152.comparisons;

import io.github.jmanrocks152.deck.Deck;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jmanrocks152 on 5/8/17.
 */
public class Comparisons {

    public static class Logic {

        try {

//The rng that determines what card each player gets, respectively
            int v1 = ThreadLocalRandom.current().nextInt(0, deck.size() + 1);
            int v2 = ThreadLocalRandom.current().nextInt(0, deck.size() + 1);
//The rng that determines each player's suit, respectively
            int sv1 = ThreadLocalRandom.current().nextInt(0, suits.size() + 1);
            int sv2 = ThreadLocalRandom.current().nextInt(0, suits.size() + 1);
            int suit1 = suits.get(sv1);
            int suit2 = suits.get(sv2);
            String suitv1 = null;
            String suitv2 = null;
//The amount of wins each player has, starting at 0
            int wins1 = 0;
            int wins2 = 0;
//The thing that checks whether or not the cards will be duplicates
            if ((sv2 + v2) - (sv1 + v1) <= 15 && (sv2 + v2) > (sv1 + v1)) {
                ++v2;
                if ((sv2 + v2) - (sv1 + v1) <= 15 && (sv1 + v1) > (sv2 + v2)) {
                    ++v1;
                }

            }
//The card each player gets, respectively
            int card1 = deck.get(v1);
            int card2 = deck.get(v2);
//What determines Player 1's card's suit
            switch (suit1) {
                case 1:
                    suitv1 = "Spades";
                    suits.remove(0);
                    break;
                case 2:
                    suitv1 = "Clubs";
                    suits.remove(suits.size() - 13);
                    break;
                case 3:
                    suitv1 = "Diamonds";
                    suits.remove(suits.size() - 26);
                    break;
                case 4:
                    suitv1 = "Hearts";
                    suits.remove(suits.size() - 39);
                    break;
                default:
                    System.out.println("A suit was not picked.");
                    break;
            }
//What determines Player 2's card's suit
            switch (suit2) {
                case 1:
                    suitv2 = "Spades";
                    suits.remove(0);
                    break;
                case 2:
                    suitv2 = "Clubs";
                    if (suits.size() > 13) {
                        suits.remove(suits.size() - 13);
                    }
                    break;
                case 3:
                    suitv2 = "Diamonds";
                    if (suits.size() > 26) {
                        suits.remove(suits.size() - 26);
                    }
                    break;
                case 4:
                    suitv2 = "Hearts";
                    if (suits.size() > 39) {
                        suits.remove(suits.size() - 39);
                    }
                    break;
                default:
                    System.out.println("A suit was not picked.");
                    break;
            }
//What determines Player 1's card
            switch (card1) {
                case 1:
                    System.out.println("Player 1 got the Ace of " + suitv1);
                    deck.remove(0);
                    break;
                case 2:
                    System.out.println("Player 1 got the Two of " + suitv1);
                    if (deck.size() > 4) {
                        deck.remove(deck.size() - 4);
                    }
                    break;
                case 3:
                    System.out.println("Player 1 got the Three of " + suitv1);
                    if (deck.size() > 8) {
                        deck.remove(deck.size() - 8);
                    }
                    break;
                case 4:
                    System.out.println("Player 1 got the Four of " + suitv1);
                    if (deck.size() > 12) {
                        deck.remove(deck.size() - 12);
                    }
                    break;
                case 5:
                    System.out.println("Player 1 got the Five of " + suitv1);
                    if (deck.size() > 16) {
                        deck.remove(deck.size() - 16);
                    }
                    break;
                case 6:
                    System.out.println("Player 1 got the Six of " + suitv1);
                    if (deck.size() > 20) {
                        deck.remove(deck.size() - 20);
                    }
                    break;
                case 7:
                    System.out.println("Player 1 got the Seven of " + suitv1);
                    if (deck.size() > 24) {
                        deck.remove(deck.size() - 24);
                    }
                    break;
                case 8:
                    System.out.println("Player 1 got the Eight of " + suitv1);
                    if (deck.size() > 28) {
                        deck.remove(deck.size() - 28);
                    }
                    break;
                case 9:
                    System.out.println("Player 1 got the Nine of " + suitv1);
                    if (deck.size() > 32) {
                        deck.remove(deck.size() - 32);
                    }
                    break;
                case 10:
                    System.out.println("Player 1 got the Ten of " + suitv1);
                    if (deck.size() > 36) {
                        deck.remove(deck.size() - 36);
                    }
                    break;
                case 11:
                    System.out.println("Player 1 got the Jack of " + suitv1);
                    if (deck.size() > 40) {
                        deck.remove(deck.size() - 40);
                    }
                    break;
                case 12:
                    System.out.println("Player 1 got the Queen of " + suitv1);
                    if (deck.size() > 44) {
                        deck.remove(deck.size() - 44);
                    }
                    break;
                case 13:
                    System.out.println("Player 1 got the King of " + suitv1);
                    if (deck.size() > 48) {
                        deck.remove(deck.size() - 48);
                    }
                    break;
                default:
                    System.out.println("A card was not picked." + suitv1);
                    break;
            }
//What determines Player 2's card
            switch (card2) {
                case 1:
                    System.out.println("Player 2 got the Ace of " + suitv2);
                    deck.remove(0);
                    break;
                case 2:
                    System.out.println("Player 2 got the Two of " + suitv2);
                    if (deck.size() > 4) {
                        deck.remove(deck.size() - 4);
                    }
                    break;
                case 3:
                    System.out.println("Player 2 got the Three of " + suitv2);
                    if (deck.size() > 8) {
                        deck.remove(deck.size() - 8);
                    }
                    break;
                case 4:
                    System.out.println("Player 2 got the Four of " + suitv2);
                    if (deck.size() > 12) {
                        deck.remove(deck.size() - 12);
                    }
                    break;
                case 5:
                    System.out.println("Player 2 got the Five of " + suitv2);
                    if (deck.size() > 16) {
                        deck.remove(deck.size() - 16);
                    }
                    break;
                case 6:
                    System.out.println("Player 2 got the Six of " + suitv2);
                    if (deck.size() > 20) {
                        deck.remove(deck.size() - 20);
                    }
                    break;
                case 7:
                    System.out.println("Player 2 got the Seven of " + suitv2);
                    if (deck.size() > 24) {
                        deck.remove(deck.size() - 24);
                    }
                    break;
                case 8:
                    System.out.println("Player 2 got the Eight of " + suitv2);
                    if (deck.size() > 28) {
                        deck.remove(deck.size() - 28);
                    }
                    break;
                case 9:
                    System.out.println("Player 2 got the Nine of " + suitv2);
                    if (deck.size() > 32) {
                        deck.remove(deck.size() - 32);
                    }
                    break;
                case 10:
                    System.out.println("Player 2 got the Ten of " + suitv2);
                    if (deck.size() > 36) {
                        deck.remove(deck.size() - 36);
                    }
                    break;
                case 11:
                    System.out.println("Player 2 got the Jack of " + suit2);
                    if (deck.size() > 40) {
                        deck.remove(deck.size() - 40);
                    }
                    break;
                case 12:
                    System.out.println("Player 2 got the Queen of " + suitv2);
                    if (deck.size() > 44) {
                        deck.remove(deck.size() - 44);
                    }
                    break;
                case 13:
                    System.out.println("Player 2 got the King of " + suitv2);
                    if (deck.size() > 48) {
                        deck.remove(deck.size() - 48);
                    }
                    break;
                default:
                    System.out.println("A card was not picked.");
                    break;
            }

            if ((v1 - v2) > 3) {
                ++wins1;
                System.out.println("Player 1 wins!");
            }
            else if((v2 - v1) > 3){
                ++wins2;
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("It was a tie.");


                if (wins1 > wins2) {
                    System.out.println("Player 1 won the game with " + wins1 + " wins!");
                }
                else if (wins2 > wins1) {
                    System.out.println("Player 2 won the game with " + wins2 + " wins!");

                }
                else if (wins1 == wins2)
                    System.out.println("Nobody won, you're all losers!");
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }
}

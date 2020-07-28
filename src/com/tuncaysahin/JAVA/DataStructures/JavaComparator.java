package com.tuncaysahin.JAVA.DataStructures;

import java.util.Comparator;

public class JavaComparator {

    // Write your Checker class here
    class Checker implements Comparator<Player> {
        int value;
        @Override
        public int compare(Player p1, Player p2){
            if(p1.score == p2.score){
                value = p1.name.compareTo(p2.name);
                return value;
            }
            value = p1.score > p2.score ? -1 : 1;
            return value;
        }
    }

    class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

}

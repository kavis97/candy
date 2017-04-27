package com.siva.exercises.candy;

public class CandyConsume {

    public Player consume(Player a, Player b) {
        a.consumed += b.consumed + 1;
        if (a.consumed > a.capacity)
            return b;
        b.consumed += a.consumed + 1;
        if (b.consumed > b.capacity)
            return a;
        return consume(a, b);
    }
}

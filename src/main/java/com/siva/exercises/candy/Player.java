package com.siva.exercises.candy;

public class Player {
    final String name;
    final int capacity;
    int consumed;

    Player(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return capacity == player.capacity && name.equals(player.name);
    }
}

package com.siva.exercises.candy;

public class Player {
    final String name;
    final int capacity;
    int consumed;

    public Player(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int consumed() { return consumed; }

    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        if (capacity != player.capacity) return false;
        return name.equals(player.name);
    }
}

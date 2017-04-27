package com.siva.exercises.candy;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CandyConsumeTest {
    private CandyConsume subject = new CandyConsume();
    Player a, b;
    Player winner;

    List<TestCase> tests;

    private class TestCase {
        Player a;
        Player b;
        Player winner;
    }

    @Before
    public void setUp() throws Exception {
        tests = new ArrayList<>();
        tests.add(testCase("Siva", 3, "Kavi", 2, "Kavi"));
        tests.add(testCase("Siva", 8, "Kavi", 11, "Kavi"));
        tests.add(testCase("Siva", 9, "Kavi", 1000, "Kavi"));
        tests.add(testCase("Siva", 4, "Kavi", 2, "Siva"));
        tests.add(testCase("Siva", 1, "Kavi", 1, "Siva"));
        tests.add(testCase("Siva", 1, "Kavi", 2, "Kavi"));
        tests.add(testCase("Siva", 1, "Kavi", 3, "Kavi"));
        tests.add(testCase("Siva", 9, "Kavi", 3, "Siva"));
        tests.add(testCase("Siva", 9, "Kavi", 11, "Kavi"));
        tests.add(testCase("Siva", 8, "Kavi", 12, "Kavi"));
    }

    private TestCase testCase(String a, int a_capacity, String b, int b_capacity, String winner) {
        TestCase t = new TestCase();
        t.a = new Player(a, a_capacity);
        t.b = new Player(b, b_capacity);
        t.winner = winner.equals(t.a.getName()) ? t.a : t.b;
        return t;
    }

    @Test
    public void executeTest() {
        tests.stream().forEach(t -> {
            whenConsume(t.a, t.b);
            thenWinner(t.winner);
        });
    }

    private void thenWinner(Player expectedWinner) {
        assertTrue(expectedWinner.equals(winner));
    }

    private void whenConsume(Player a, Player b) {
        winner = subject.consume(a, b);
    }
}
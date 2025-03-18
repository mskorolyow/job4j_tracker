package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball spike = new Ball();
        Hare squint = new Hare();
        squint.tryEat(spike);
        Wolf gray = new Wolf();
        gray.tryEat(spike);
        Fox redhead = new Fox();
        redhead.tryEat(spike);

    }
}

package com.javarush.task.task14.task1413;

public class Computer {
    private Keyboard keyboard = new Keyboard();
    private Monitor monitor = new Monitor();
    private Mouse mouse = new Mouse();

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

}

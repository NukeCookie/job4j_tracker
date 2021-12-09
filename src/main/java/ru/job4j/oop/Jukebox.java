package ru.job4j.oop;

public class Jukebox {
    @SuppressWarnings("checkstyle:RightCurly")
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox boombox = new Jukebox();
        boombox.music(1);
        boombox.music(2);
        boombox.music(3);
    }
}
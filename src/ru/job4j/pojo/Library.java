package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("Колобок", 10);
        Book secondBook = new Book("Java для чайников", 368);
        Book thirdBook = new Book("Гарри Поттер и философский камень", 399);
        Book fourthBook = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;
        System.out.println("Содержимое массива.");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages() + " стр.");
        }
        System.out.println("Переставим местами книги с индексом 0 и 3.");
        books[0] = fourthBook;
        books[3] = firstBook;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages() + " стр.");
        }
        System.out.println("Вывод книг с именем \"Clean code\".");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getTitle())) {
                System.out.println(bk.getTitle() + " - " + bk.getPages() + " стр.");
            }
        }
    }
}
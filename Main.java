package com.magicofbooks;

import com.magicofbooks.pojo.User;

public class Main {
    public static void main(String[] args) {

        ///Menu olusturulucak. Ve Validation yapilicak!!!
        MagicOfBooks magicOfBooks = new MagicOfBooks();
        magicOfBooks.insert();
        magicOfBooks.createNewBooks(1);
        magicOfBooks.getFavorite(1);
        magicOfBooks.getAllDetails(1);


    }
}

package com.magicofbooks.pojo;


public class User {


    private int userId;
    private String userName;
    private String email;
    private String password;
//    private Book[] newBooks;
//    private Book[] favorite;
//    private Book[] completed;


    public User() {

    }
    public User(String userName){
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Book[] getNewBooks(int numberOfBooks) {
//        return newBooks;
//    }
//
//    public void setNewBooks(Book[] newBooks) {
//        this.newBooks = newBooks;
//    }
//
//    public Book[] getFavorite() {
//        return favorite;
//    }
//
//    public void setFavorite(Book[] favorite) {
//        this.favorite = favorite;
//    }
//
//    public Book[] getCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(Book[] completed) {
//        this.completed = completed;
//    }


    // App in icine girmek icin username kullanilir. Eger username girilenle uyusursa islemler devam eder.
    // burada bir secenek menusu gelicek. buradan 3 yol var bunlardan birisi new, favori, veya completed. Bunu bir menu icersinde getiriceksin.
    // getById(int bookId);
    // getBookDetails() // Book detailsin hepsini getiricem, Author name ve description gibi.
}

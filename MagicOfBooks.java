package com.magicofbooks;

import com.magicofbooks.pojo.Book;
import com.magicofbooks.pojo.User;

import java.util.Scanner;

public class MagicOfBooks {
    private Book[] books;
    private Scanner scanner;
    private User user;
    private Book book;
    public MagicOfBooks(){
        scanner = new Scanner(System.in);
        System.out.println("Please enter the number of books you want: ");
        int numberOfBooks = scanner.nextInt();
        books = new Book[numberOfBooks];
    }
    public void insert (){
        for (int i = 0; i < books.length; i++) {
            book = new Book();
            System.out.println("Enter the bookid: ");
            book.setBookId(scanner.nextInt());
            System.out.println("Enter the book name: ");
            book.setBookName(scanner.next());
            System.out.println("Enter book of author name: ");
            book.setAuthorName(scanner.next());
            System.out.println("Enter book of description: ");
            book.setDescription(scanner.next());
            books[i] = book;
        }
    }
    public void createNewBooks(int typeBook){


            for (int i = 0; i < books.length-1; i++) {
                System.out.println("Enter the bookid: ");
                book.setBookId(scanner.nextInt());
                System.out.println("Enter the book name: ");
                book.setBookName(scanner.next());
                System.out.println("Enter book of author name: ");
                book.setAuthorName(scanner.next());
                System.out.println("Enter book of description: ");
                book.setDescription(scanner.next());
                books[i] = book;

            }
        /*for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookId());
            System.out.println(books[i].getBookName());
        }*/

        }

        public void getFavorite(int typeBook){

                System.out.println("Please select your favorite book by book id: ");
                typeBook = scanner.nextInt();
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookId()== typeBook){
                    System.out.println("Your favorite book name is: " + books[i].getBookName());
                }
            }
        }

        public void getAllDetails(int typeBook){
            System.out.println("Please select your book infos by Book id: ");
            typeBook = scanner.nextInt();
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookId()== typeBook){
                    System.out.println("Your favorite book name is: " + books[i].getBookName());
                    System.out.println("Your favorite book name is: " + books[i].getDescription());
                    System.out.println("Your favorite book name is: " + books[i].getAuthorName());
                }
            }
        }


    }


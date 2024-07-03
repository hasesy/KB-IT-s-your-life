package afternoon.nested.local.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        if (bookCount == LIBRARY_SIZE) {
            System.out.println("더 이상 책을 보관할 수 없습니다!");
        } else {
            System.out.print("책 제목을 입력하세요 : ");
            String title = scanner.nextLine();
            System.out.print("책 저자를 입력하세요 : ");
            String author = scanner.nextLine();

            this.books[bookCount] = new Book(title, author);

            bookCount++;

            System.out.println("보관된 책의 수는 : " + bookCount);
            System.out.println("=== 책 보관 완료 ===");
        }
    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        System.out.println("*** 총 보관 책의 수는 : " + bookCount + " 입니다! ***");

        for (int i = 0; i < bookCount; i++) {
            System.out.print(i + 1 + ". 제목 : " + books[i].title);
            System.out.println(" / 저자 : " + books[i].author);
        }
    }

    public void removeBook() {
        if (bookCount == 0) {
            System.out.println("*** 보관된 책이 존재하지 않습니다! ***");
        } else {
            List<Book> bookList = new ArrayList<>(Arrays.asList(books));
            bookList.remove(0);
            bookList.toArray(books);
            System.out.println("*** 가장 오래된 책이 삭제되었습니다! ***");
            bookCount--;
        }
    }

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}

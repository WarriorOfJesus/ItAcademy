package itacademy.library;

import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    private String giftBy;
    private String pressMark;
    private final boolean needsRepair;


    Book(String author, String title, int pageCount, String giftBy, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftBy = giftBy;
        this.pressMark = author + "." + pageCount + "." + title;
        this.needsRepair = needsRepair;
    }

    public void setAuthor(String author) {
        this.author = author;
        this.pressMark = this.author + "." + this.pageCount + "." + this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
        this.pressMark = this.author + "." + this.pageCount + "." + this.title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        this.pressMark = this.author + "." + this.pageCount + "." + this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setGiftBy(String giftBy) {
        this.giftBy = giftBy;
    }

    public String getGiftBy() {
        return this.giftBy;
    }

    public String getPressMark() {
        return this.pressMark;
    }

    public void setNeedsRepair() {
    }

    public boolean getNeedsRepair() {
        return this.needsRepair;
    }

    @Override
    public String toString() {
        return "author: " + author + ", title: " +
                title + ", page Count: " + pageCount +
                ", giftBy: " + giftBy + ", press Mark: " + pressMark +
                ", needs Repair? " + needsRepair;
    }
}

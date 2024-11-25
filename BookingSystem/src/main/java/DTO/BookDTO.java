package DTO;

public class BookDTO {

    private Long bookUniqueId;

    private String bookName;

    private int bookType;

    public Long getBookUniqueId() {
        return bookUniqueId;
    }

    public void setBookUniqueId(Long bookUniqueId) {
        this.bookUniqueId = bookUniqueId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookType() {
        return bookType;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
    }
}

package CodingTest_2;

public class EBook extends Book{
    private double fileSize;
    private int accessCount;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    void access() {
        accessCount = accessCount + 1;
        System.out.println(getTitle()+" 조회 횟수: " + accessCount);
    }

    @Override
    void displayDetails() {
        System.out.println("Ebook - 제목: " + getTitle() + ", 저자: " + getAuthor()
        + ", 파일 사이즈: " + fileSize +"MB, 조회 횟수: " + accessCount);
    }
}

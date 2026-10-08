
package track.M05_OOPs.T01;

public class BookApp {

    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        b.getData();
    }
}

class Book {

    private int pageNumber;

    public void setData(int x) {
        if (x > 0) {
            pageNumber = x;
        }
    }

    public void getData() {
        System.out.println(pageNumber);
    }
}

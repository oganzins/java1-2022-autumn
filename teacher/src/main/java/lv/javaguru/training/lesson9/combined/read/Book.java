package lv.javaguru.training.lesson9.combined.read;

public class Book extends AbstractBook {

    public Book(String[] pages) {
        super(pages);
    }

    @Override
    public int pageCount() {
        return pages.length;
    }

    @Override
    public String readPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= pages.length) {
            return pages[pageNumber - 1];
        }
        return "";
    }
}

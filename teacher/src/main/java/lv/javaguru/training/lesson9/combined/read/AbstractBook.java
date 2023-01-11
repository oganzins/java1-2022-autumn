package lv.javaguru.training.lesson9.combined.read;

public abstract class AbstractBook implements Readable {

    protected String[] pages;

    public AbstractBook(String[] pages) {
        this.pages = pages;
    }

    public String[] getPages() {
        return pages;
    }

    @Override
    public String read() {
        String content = "";
        for (int i = 0; i < pages.length; i++) {
            content += pages[i];
            content += " ";
        }
        return content;
    }

    public abstract int pageCount();

    public abstract String readPage(int pageNumber);

}

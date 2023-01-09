package lv.javaguru.training.lesson9.combined.read;

public class TextMessage implements Readable {

    private String text;

    public TextMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String read() {
        return text;
    }
}

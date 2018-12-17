package task;

public class SimpleTextProvider implements ItextProvider {
    private String string;

    public SimpleTextProvider(String string) {
        this.string = string;
    }

    @Override
    public String getText() {
        return string;
    }
}

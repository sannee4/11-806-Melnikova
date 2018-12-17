package task;

public class FileTextProvider implements ItextProvider {
    private File input;

    public FileTextProvider(File input) {
        this.input = input;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTextProviderImp implements ITextProvider {
    protected File input;

    public FileTextProviderImp(File input) {
        this.input = input;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while (sc.hasNextLine()) {
                sb.append(sc.hasNextLine());
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


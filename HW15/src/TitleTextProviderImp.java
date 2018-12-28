import java.io.File;

public class TitleTextProviderImp extends FileTextProviderImp {
    public TitleTextProviderImp(File input){
        super(input);
    }
    @Override
    public String getText(){
        return input.getName() + " " + super.getText();
    }
}

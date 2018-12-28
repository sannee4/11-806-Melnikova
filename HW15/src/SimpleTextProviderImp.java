public class SimpleTextProviderImp implements ITextProvider {
    private String string;

    public SimpleTextProviderImp(String string){
        this.string =string;
    }

    @Override
    public String getText(){
        return string;
    }
}

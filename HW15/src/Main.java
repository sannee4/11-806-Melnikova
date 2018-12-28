import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SearchEngineImp searchEngine = new SearchEngineImp();
        List<ITextProvider> textProviderList = new ArrayList<>();

        textProviderList.add(new SimpleTextProviderImp(" сегодня я сдала зачёт по дискретке"));
        textProviderList.add(new SimpleTextProviderImp(" сегодня я сдала зачёт"));
        textProviderList.add(new SimpleTextProviderImp(" сегодня был зачёт по истории"));

        ITextProvider query = new SimpleTextProviderImp("зачёт по истории");

        List<ITextProvider> sortList = searchEngine.getSortedByRelevanceList(new CosineSimilarityImp(), query, textProviderList);
        for(ITextProvider textProvider : sortList){
            System.out.println(textProvider.getText());
        }
    }
}

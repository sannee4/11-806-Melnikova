import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchEngineImp implements ISearchEngine {
    private int getNext(HashMap<Integer, Double> coefList) {
        double max = 0;
        int index = 0;
        for(Map.Entry<Integer, Double> coef: coefList.entrySet()){
            if(coef.getValue()>=max){
                max = coef.getValue();
                index = coef.getKey();
            }
        }
        coefList.remove(index);
        return index;
    }
    @Override
    public List<ITextProvider> getSortedByRelevanceList(ITextAnalyze textAnalyze, ITextProvider query, List<ITextProvider> sources){
        HashMap<Integer, Double> coefList =new HashMap<>();
        List<ITextProvider> relevanceList = new ArrayList<>();

        for (int i = 0; i <sources.size() ; i++) {
            relevanceList.add(sources.get(getNext(coefList)));
        }
        return relevanceList;
    }
}

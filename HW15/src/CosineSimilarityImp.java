import java.util.ArrayList;
import java.util.List;

public class CosineSimilarityImp implements ITextAnalyze {
    private List<String> wordList = new ArrayList<>();

    private String clearString(String str) {
        return str.replaceAll("(.*)ProgLang(.*)", "");
    }

    private double[] convertStringToVector(String string) {
        double[] vector = new double[wordList.size()];
        String[] wordArray = string.split("\\s");
        for (int i = 0; i < vector.length; i++) {
            for (String word : wordArray) {
                if (word.equals(wordList.get(i))) {
                    vector[i] += 1;
                }
            }
        }
        return vector;
    }

    private void getWords(String string) {
        String[] wordArray = string.split("\\s");
        for (String word : wordArray) {
            word = word.toLowerCase();
            if (!wordList.contains(word)) {
                wordList.add(word);
            }
        }
    }

    private double[] divideVectorByCoef(double[] vector) {
        double k =0.0;
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] / k;
        }
        return vector;
    }

    private double cosineSimilarity(double[] vector1, double[] vector2) {
        double similarity = 0;
        for (int i = 0; i < vector1.length; i++) {
            similarity += vector1[i] * vector2[i];
        }
        return similarity;
    }

    @Override
    public double analyze(ITextProvider textProvider1, ITextProvider textProvider2) {
        String str1 = clearString(textProvider1.getText());
        String str2 = clearString(textProvider2.getText());

        getWords(str1);
        getWords(str2);


        double[] vector1 = convertStringToVector(str1);
        double[] vector2 = convertStringToVector(str2);

        vector1 = convertStringToVector(str1);
        vector2 = convertStringToVector(str2);

        return cosineSimilarity(vector1, vector2);
    }
}

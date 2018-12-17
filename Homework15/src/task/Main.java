package task;

public class Main {
    public class Main {
        public static void main(String[] args) {
            String s1 = "я люблю пить колу со льдом";
            String s2 = "я не люблю колу";

            ITextAnalyze textAnalyze = new CosineSimilarity();

            double similarity = textAnalyze.analyze(new SimpleTextProvider(str1), new SimpleTextProvider(str2));


            System.out.println("similarity: " + similarity);
        }
    }
}

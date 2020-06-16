import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence implements IPrintable {
    private String sentenceConstraints = "^(.+)\\.$";
    private int sentenceCounter = 0;

    /**
     * Sentence Counting Process
     * @param operand Operand to match
     * */
    public void countSentence(String operand) {
        Pattern pattern = Pattern.compile(sentenceConstraints);
        Matcher matcher = pattern.matcher(operand);

        boolean result = matcher.matches();

        //Is there sentence in the file?
        if (result) {
            sentenceCounter++;
        }
    }

    @Override
    public void print() {
        System.out.printf("%s%3s%d\n","Total Sentence Count",": ",sentenceCounter);
    }
}

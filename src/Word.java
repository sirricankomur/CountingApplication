public class Word implements IPrintable {
    private int wordCounter = 0;

    /**Word Counting Process*/
    public void countWord() {
        wordCounter++;
    }

    @Override
    public void print() {
        System.out.printf("%s%7s%d\n","Total Word Count",": ",wordCounter);
    }
}
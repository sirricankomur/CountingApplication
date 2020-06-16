/**
 * @author Sırrı Can KÖMÜR
 * @since 29.02.2020
 * <p>
 *     In The File; Vowel, Word, Sentence, Mail and Website Number Finding Program
 * </p>
 */

public class Main {

    public static void main(String[] args) {
        String fileName = "sampleText.txt";

        FileProcessing fileProcessing = new FileProcessing();
        fileProcessing.readFile(fileName);
    }
}

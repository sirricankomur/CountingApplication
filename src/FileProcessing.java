import java.io.File;
import java.util.Scanner;

public class FileProcessing {
    Website website = new Website();
    Mail mail = new Mail();
    Vowel vowel = new Vowel();
    Word word = new Word();
    Sentence sentence = new Sentence();

    /**
     * File Reading Process
     * @param fileName File to Process
     * */
    public void readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String operand = scanner.next();
                website.countWebsite(operand);
                mail.countMail(operand);
                vowel.countVowel(operand);
                sentence.countSentence(operand);
                word.countWord();
            }

            printResults();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    /**The process of pressing the results to the screen*/
    public void printResults() {
        vowel.print();
        word.print();
        sentence.print();
        mail.print();
        website.print();
    }

}
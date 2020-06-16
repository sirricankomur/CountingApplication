public class Vowel implements IPrintable {
    private String vowels = "[^aeıioöuüAEIİOÖUÜ]";
    private int vowelCounter = 0;

    /**
     * Vowel Counting Process
     * @param operand Operand to match
     * */
    public void countVowel(String operand) {

        //Delete where the constraints match and add the number of leftovers.
        vowelCounter += operand.replaceAll(vowels, "").length();
    }

    @Override
    public void print() {
        System.out.printf("%s%6s%d\n","Total Vowel Count",": ",vowelCounter);
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail implements IPrintable {
    private String mailConstraints = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
    private int mailCounter = 0;

    /**
     * Mail Counting Process
     * @param operand Operand to match
     * */
    public void countMail(String operand) {
        Pattern pattern = Pattern.compile(mailConstraints);
        Matcher matcher = pattern.matcher(operand);

        boolean result = matcher.matches();

        //Is there mail in the file?
        if (result) {
            mailCounter++;
        }
    }

    @Override
    public void print() {
        System.out.printf("%s%7s%d\n","Total Mail Count",": ",mailCounter);
    }
}

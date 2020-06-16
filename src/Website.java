import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Website implements IPrintable {
    private String domainConstraints = "^(http://|https://)?(www\\.)?[a-z0-9][a-z0-9\\-]+[.](com|edu|net|org|com.tr|edu.tr|net.tr|org.tr)+(/)?$";
    private int websiteCounter = 0;

    /**
     * Website Counting Process
     * @param operand Operand to match
     * */
    public void countWebsite(String operand) {
        Pattern pattern = Pattern.compile(domainConstraints);
        Matcher matcher = pattern.matcher(operand);
        boolean result = matcher.matches();

        //Is there website in the file?
        if (result) {
            websiteCounter++;
        }
    }

    @Override
    public void print() {
        System.out.printf("%s%4s%d\n","Total Website Count",": ",websiteCounter);
    }
}

package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDelimiter {

    // 2. 구분자 구하기
    public ArrayList<String> getDelimiter(String input) {
        Pattern pattern = Pattern.compile("//([^a-zA-Z0-9|\\s])\\\\n");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> delimiter = new ArrayList<>(
                Arrays.asList(",", ":")
        );

        if (matcher.find()) {
            delimiter.add(matcher.group(1));
        }

        return delimiter;
    }

}

package com.epam.pdp.sto.thinkinginjava.strings.exercises;
/* NOT FINISHED
* For the phrase "Java now has regular expressions" evaluate whether the following
* expressions will find a match:
* */
// Use args: "Java now has regular expressions", "^Java", "\Berg.*", "n.w\s+h(a|i)s",
//"s?", "s+", "s{4}", "s{1}.", "s{0,3}"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        String string = "Java now has regular expressions";
        Pattern pattern1 = Pattern.compile("^Java");
        Matcher matcher1 = pattern1.matcher(string);

    }
}

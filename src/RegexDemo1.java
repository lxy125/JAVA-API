import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        //爬虫练习
        //本地练习

        String text = "我的手机号码是：12345678901，收下吧";
        Pattern p = Pattern.compile("1[0-9]\\d{9}");

        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {
        //贪婪爬取
        //非贪婪爬取

        String s = "abbbbbbbbbaaaaaaaaaaa";
        //默认贪婪爬取
        String regex = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}

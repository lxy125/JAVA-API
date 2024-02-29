public class RegexDemo12 {
    public static void main(String[] args) {
        //需求：判断一个字符串的开始字符和结束字符是否一致，只考虑一个字符
        //举例 a123a b123b  c123c  d123d 1242322
        String regex1 ="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b123b".matches(regex1));
        System.out.println("c123c".matches(regex1));
        System.out.println("d123d".matches(regex1));
        System.out.println("1242322".matches(regex1));




    }
}

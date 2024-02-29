public class Test2 {
    public static void main(String[] args) {
        //实现parseInt方法
        String s = "12345678";
        //校验字符串
        if(!s.matches("[1-9]\\d{0,9}")){
            System.out.println("数据不合法");
        }else{
            System.out.println("数据正确");

            int number = 0;
            //遍历字符串
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);//获取每一个字符
                int n = c - '0';//将字符转换为数字
                number = number * 10 + n;

            }
            System.out.println("number:"+number);



        }
    }
}

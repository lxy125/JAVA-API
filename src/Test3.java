public class Test3 {
    public static void main(String[] args) {
        //定义一个方法实现toBinaryString，将一个十进制整数转成字符串表示的二进制

        System.out.println(toBinaryString(6));


    }

    public static String toBinaryString(int num) {
        //定义一个方法实现toBinaryString，将一个十进制整数转成字符串表示的二进制
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (num == 0) {
                break;
            }

            int remainder = num % 2;
            // System.out.println("remainder:"+remainder);
            //sb.append(remainder);//将余数添加到StringBuilder
            sb.insert(0, remainder);//将余数添加到StringBuilder

            num = num / 2;

        }

        return sb.toString();


    }
}

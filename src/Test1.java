import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入1-100之间的数据,添加到集合直到所有数据和大于200
        //1。创建一个集合添加整数

        ArrayList<Integer> list = new ArrayList<>();
        //2。键盘录入数据添加到集合

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个1-100之间的数据");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            //异常处理
            if(num<1 || num>100){
                System.out.println("数据不合法");
                continue;
            }
            list.add(num);
            //3。判断集合中的数据和是否大于200
            int sum = getSum(list);
            if(sum>200){
                System.out.println("数据和已经大于200");
                break;

            }
            //4。输出集合
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }

        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

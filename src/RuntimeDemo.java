import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取运行时对象
        Runtime run = Runtime.getRuntime();
        Runtime run1 = Runtime.getRuntime();
        System.out.println(run == run1);//true

        //exit()方法
        //Runtime.getRuntime().exit(0);

        //获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//12

        //总内存大小
        System.out.println(Runtime.getRuntime().maxMemory());//123731968

        //已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory());

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory());

        //运行cmd命令
        Runtime.getRuntime().exec("notepad.exe");
    }
}

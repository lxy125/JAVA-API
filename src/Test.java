import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //初始化界面
        initUI();
    }

    private static void initUI() {
        JLabel label1 = new JLabel("你帅吗？");
        label1.setBounds(50, 50, 100, 30);
        //设置居中偏上
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.TOP);
        //设置字体
        label1.setFont(new java.awt.Font("楷体", 1, 20));

        JFrame frame = new JFrame();
        frame.add(label1);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JButton button1 = new JButton("帅");
        button1.setBounds(50, 100, 100, 30);
        frame.add(button1);

        JButton button2 = new JButton("丑爆了");
        button2.setBounds(50, 150, 100, 30);
        frame.add(button2);



    }
}

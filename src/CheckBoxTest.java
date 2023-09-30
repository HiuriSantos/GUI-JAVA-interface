import javax.swing.JFrame;

public class CheckBoxTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Minha Janela");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();

        jFrame.setSize(300,125);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(checkBoxFrame);
    }


}

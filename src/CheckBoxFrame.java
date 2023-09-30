import javax.swing.*;
import java.awt.*;


public class CheckBoxFrame extends JPanel {
    private final JButton[] buttons;
    private final JPanel buttonsPanel;
    private final JCheckBox[] checkBoxes;
    private final JPanel checkboxPanel;
    private final TextField[] textFields;
    private final JPanel textPanel;
    private final JLabel[] label1;
    private final JPanel JlabelPanel;
    public CheckBoxFrame(){
        super();
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 1));
        checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(2,1));
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2,1));
        JlabelPanel = new JPanel();
        JlabelPanel.setLayout(new GridLayout(2,1));
        buttons = new JButton[3];
        checkBoxes = new JCheckBox[2];
        textFields = new TextField[2];
        label1 = new JLabel[2];
        for (int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton("Button " + (i +1));
            buttonsPanel.add(buttons[i]);
        }
        for (int i = 0; i < checkBoxes.length; i++){
            checkBoxes[i] = new JCheckBox("Check box " + (i +1));
            checkboxPanel.add(checkBoxes[i]);
        }
        for (int i = 0; i < textFields.length; i++){
            textFields[i] = new TextField("X: ");
            textPanel.add(textFields[i]);
        }
        for (int i = 0; i < label1.length; i++){
            label1[i] = new JLabel("X: ");
            JlabelPanel.add(label1[i]);
        }
        add(checkboxPanel, BorderLayout.WEST);
        add(JlabelPanel, BorderLayout.CENTER);
        add(textPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.EAST);
    }
}
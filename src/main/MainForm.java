package main;

import javax.swing.*;

public class MainForm extends JFrame{

    private JPanel rootPanel;
    private JTextField passwdField;
    private JComboBox comboLenght;
    private JButton buttonGenerate;
    private JTextField md5Field;
    private JTextField sha1Field;
    private JTextField sha256Field;

    public MainForm(){
        super("Title");
        setContentPane(rootPanel);
        setSize(500,500);
        setVisible(true);
    }
}

package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Swing<userText> {
        private JFrame mainFrame;
        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;

        public Swing(){
            prepareGUI();
        }

        public static void main(String[] args){
            Swing  swingControlDemo = new Swing();
            swingControlDemo.showLabelDemo();

            Swing  swingControlDe = new Swing();
            swingControlDe.showLabelDemo();

            Swing swingControlD = new Swing();
            swingControlD.showLabelDemo();

            Swing  swingControl = new Swing();
            swingControl.showLabelDemo();
        }

        private void prepareGUI(){
            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            headerLabel = new JLabel("", JLabel.CENTER);
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            headerLabel = new JLabel("", JLabel.CENTER);
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());
            controlPanel.setLayout(new GridLayout(0, 1));

            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            headerLabel = new JLabel("", JLabel.CENTER);
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame.add(headerLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        private void showLabelDemo(){
            headerLabel.setText("Control in action: JLabel");
            JLabel label  = new JLabel("", JLabel.CENTER);
            label.setText("Laboratorul 10");
            label.setOpaque(true);
            label.setBackground(Color.BLUE);
            label.setForeground(Color.WHITE);
            controlPanel.add(label);

            mainFrame.setVisible(true);

            headerLabel.setText("Control in action: JTextField");

            JLabel  namelabel= new JLabel("User ID: ", JLabel.RIGHT);
            JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
            final JTextField userText = new JTextField(6);
            final JPasswordField passwordText = new JPasswordField(6);

            JButton loginButton = new JButton("Login");
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String data = "Username " + userText.getText();
                    data += ", Password: " + new String(passwordText.getPassword());
                    statusLabel.setText(data);
                }
            });

            headerLabel.setText("Control in action: JSlider");
            JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,10);

            slider.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    statusLabel.setText("Value : " + ((JSlider)e.getSource()).getValue());
                }
            });
            controlPanel.add(slider);
            mainFrame.setVisible(true);

            headerLabel.setText("Control in action: RadioButton");

            final JRadioButton radApple = new JRadioButton("Apple", true);
            final JRadioButton radMango = new JRadioButton("Mango");
            final JRadioButton radPeer = new JRadioButton("Peer");

            radApple.setMnemonic(KeyEvent.VK_C);
            radMango.setMnemonic(KeyEvent.VK_M);
            radPeer.setMnemonic(KeyEvent.VK_P);

            radApple.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    statusLabel.setText("Apple RadioButton: "
                            + (e.getStateChange()==1?"checked":"unchecked"));
                }
            });
            radMango.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    statusLabel.setText("Mango RadioButton: "
                            + (e.getStateChange()==1?"checked":"unchecked"));
                }
            });
            radPeer.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    statusLabel.setText("Peer RadioButton: "
                            + (e.getStateChange()==1?"checked":"unchecked"));
                }
            });

            //Group the radio buttons.
            ButtonGroup group = new ButtonGroup();

            group.add(radApple);
            group.add(radMango);
            group.add(radPeer);

            controlPanel.add(radApple);
            controlPanel.add(radMango);
            controlPanel.add(radPeer);

            controlPanel.add(namelabel);
            controlPanel.add(userText);
            controlPanel.add(passwordLabel);
            controlPanel.add(passwordText);
            controlPanel.add(loginButton);
            mainFrame.setVisible(true);
        }
}





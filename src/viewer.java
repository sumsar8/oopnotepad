import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class viewer {

    public JButton getÖppnabutton(){
        return öppnabutton;
    }

    public JButton getNyttbutton() {
        return nyttbutton;
    }

    public JButton getSparabutton() {
        return sparabutton;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    private JPanel panel1;
    private JTextArea textArea1;
    private JButton öppnabutton;
    private JButton sparabutton;
    private JButton nyttbutton;
}
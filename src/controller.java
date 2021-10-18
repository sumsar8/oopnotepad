import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class controller {
    private viewer viewer;
    public controller(){
        JFrame frame = new JFrame("Note19pad");
        viewer = new viewer();
        frame.setContentPane(viewer.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        menu();
    }
    public static void main(String[] args) {
        controller C = new controller();
    }

    public void menu() {
        viewer.getNyttbutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewer.getTextArea1().setText("");
            }
        });


        viewer.getÖppnabutton().addActionListener(e -> {
            try
            {
                FileReader reader = new FileReader("test.txt");
                BufferedReader br = new BufferedReader(reader);
                viewer.getTextArea1().read( br, null );
                br.close();
                viewer.getTextArea1().requestFocus();
            }
            catch(Exception e2) { System.out.println(e2); }
        });

        //JButton write = new JButton("Write test.txt");
        viewer.getSparabutton().addActionListener(e -> {
            try
            {
                FileWriter writer = new FileWriter("test.txt");
                BufferedWriter bw = new BufferedWriter( writer );
                viewer.getTextArea1().write( bw );
                bw.close();
                viewer.getTextArea1().setText("");
                viewer.getTextArea1().requestFocus();
            }
            catch(Exception e2) {}
        });
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel rootPanel;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnLogin;

    public MainForm() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to login",
                        "Question", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    //System.out.println("Da");
                    JOptionPane.showConfirmDialog(null,
                            "You have selected to log in",
                            "Result",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    System.out.println("Nu");
                }

                System.out.println(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //test
        //test2
    }
}

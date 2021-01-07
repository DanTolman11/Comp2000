import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class customerKiosk extends JFrame {
    private JPanel mainPanel;
    private JLabel kioskLabel;
    private JLabel adminLabel;
    private JTextField adminNameTxt;
    private JButton adminLoginBtn;
    private JLabel outputLabel;
    private JList list1;
    private JLabel stockLabel;
    private JLabel basketLabel;
    private JButton button1;
    private JTextField adminPwordTxt;
    private JPasswordField adminPasswordTxt;


    public customerKiosk(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        pack();

        adminLoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String adminUsername = adminNameTxt.getText();
                String adminPassword = adminPwordTxt.getText();

                if(adminUsername.equals("")){
                    outputLabel.setText("Provide username");
                }else{
                    outputLabel.setText(("Valid username: " + adminUsername));
                    //outputLabel.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        customerKiosk page = new customerKiosk();
        page.setVisible(true);
    }

}

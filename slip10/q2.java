package slip10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame {

    private JTextField username;
    private JPasswordField password;
    private JButton login,reset;

    public  q2() {
    
        setTitle("form");
        setLayout(new GridLayout(3,2,10,10));


        JLabel userLabel = new JLabel("username");
        username = new JTextField (20);

        JLabel passwordLabel = new JLabel("Password");
        password = new JPasswordField(20);

        login = new JButton("Login");
        reset = new JButton("reset");

        add(userLabel);
        add(username);
        add(passwordLabel);
        add(password);
        add(login);
        add(reset);

        reset.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e){
                username.setText("");
                password.setText("");
            }   
        });

        login.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"login success");
            }
        });

        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        


        
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run(){
                new q2().setVisible(true);
            }
        });
    }
    
}

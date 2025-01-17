package tubespbo.View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import tubespbo.Contoller.Controller;

public class LogIn {

    public LogIn() {
        showPencarianScreen();
    }

    private void showPencarianScreen() {
        JFrame f = new JFrame("Login");
        Controller con = new Controller();

        JLabel intro = new JLabel("Selamat Datang di Josen!");
        Font font = new Font("Courier", Font.BOLD, 20);
        JLabel intro2 = new JLabel("Satu langkah lagi untuk masuk");
        Font font2 = new Font("Courier", Font.PLAIN, 16);
        intro.setFont(font);
        intro2.setFont(font2);
        intro.setBounds(10, 10, 300, 30);
        intro2.setBounds(10, 30, 250, 30);

        Font fontLabel = new Font("Courier", Font.BOLD, 16);

        JLabel email = new JLabel("Username ");
        email.setBounds(10, 100, 100, 30);
        JTextField inputName = new JTextField();
        inputName.setBounds(120, 100, 200, 30);

        JLabel password = new JLabel("Password ");
        password.setBounds(10, 130, 100, 30);
        JPasswordField inputPassword = new JPasswordField();
        inputPassword.setBounds(120, 130, 200, 30);
        
        Font fontButton = new Font("Courier", Font.BOLD,12);

        JButton buttonCari = new JButton("Masuk");
        buttonCari.setFont(fontButton);
        buttonCari.setBounds(215, 300, 100, 30);
        buttonCari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = String.valueOf(inputPassword.getPassword());
                boolean found = con.logIn(inputName.getText(), password);
                if (found) {
                    f.dispose();
                    int id = con.getIDUser(inputName.getText());
                    String role = con.getRolesUser(id);
                    if (role.equalsIgnoreCase("Admin")) {
                        new MainMenuAdmin(id);
                    } else if (role.equalsIgnoreCase("Passanger")) {
                        new MainMenuPassanger(id);
                    } else if (role.equalsIgnoreCase("Driver")) {
                        new MainMenuDriver(id);
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Maaf Akun tidak ditemukan", "", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        JButton backButton = new JButton("Kembali");
        backButton.setFont(fontButton);
        backButton.setBounds(50, 300, 100, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new StartMenu();
            }
        });

        f.add(intro);
        f.add(intro2);

        f.add(email);
        f.add(inputName);
        f.add(password);
        f.add(inputPassword);
        f.add(backButton);
        f.add(buttonCari);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
}

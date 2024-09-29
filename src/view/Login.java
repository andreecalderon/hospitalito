package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel email;
    private JTextField user;
    private JLabel pass;
    private JButton boton;

    public Login (){
        //CONFIGURACIÓN DE LA VENTANA
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //

        UIManager.put("Label.font", new Font("Arial", Font.BOLD, 22));
        UIManager.put("Button.font", new Font("Arial", Font.BOLD, 20));
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 20));
        UIManager.put("TextArea.font", new Font("Arial", Font.PLAIN, 20));
        UIManager.put("List.font", new Font("Arial", Font.PLAIN, 20));

        //PANEL INICIAL
        JPanel Mainpanel = new JPanel(new GridLayout(1, 1));

        //SEGUNDO PANEL
        JPanel segundoPanel = new JPanel(new GridBagLayout());

        //RESTRICCIONES
        GridBagConstraints coartacion = new GridBagConstraints();
        coartacion.insets = new Insets(15, 10, 15, 10);  // Agregar espacio entre los componentes
        coartacion.gridx = 0;
        coartacion.gridy = 0;

        email = new JLabel("Usuario:");
        segundoPanel.add(email, coartacion);

        coartacion.gridx = 0;
        coartacion.gridy = 1;

        user = new JTextField();
        coartacion.gridx = 1;
        coartacion.gridy = 0;
        user.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK)); // Líneas inferiores negras
        user.setPreferredSize(new Dimension(150, 30));
        segundoPanel.add(user, coartacion);
        coartacion.gridx = 0;
        coartacion.gridy = 2;


        pass = new JLabel("Contraseña:");
        segundoPanel.add(pass, coartacion);

        coartacion.gridx = 1;
        coartacion.gridy = 2;
        JPasswordField contra = new JPasswordField();
        contra.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK)); // Líneas inferiores negras
        contra.setPreferredSize(new Dimension(150, 30));
        segundoPanel.add(contra, coartacion);
        coartacion.gridx = 1;
        coartacion.gridy = 4;

        boton = new JButton("Iniciar Sesión");
        boton.setBackground(new Color(0, 0, 0));
        boton.setForeground(new Color(255, 255, 255));
        segundoPanel.add(boton, coartacion);

        Mainpanel.revalidate();
        Mainpanel.repaint();
        Mainpanel.add(segundoPanel);

        this.add(Mainpanel);
        this.setVisible(true);
    }

    public String getCOrreo() {
        return user.getText();
    }

    public String getContra() {
        return pass.getText();
    }

    public void addLoginListener(ActionListener listener) {
        boton.addActionListener(listener);        }
}
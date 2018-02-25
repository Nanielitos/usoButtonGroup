import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class agruparBotones extends JFrame
        implements ActionListener {

    public agruparBotones(String titulo) {

        //Creación de los RadioButtons animales
        JRadioButton birdButton = new JRadioButton("Pajarrako");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gato");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Doggo");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Piggy");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        //cración de los botones horizontales
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        //añadir los botones de animales a un grupo
        ButtonGroup btgAnimalitos = new ButtonGroup();
        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        //Añadir los botones de animales en un BoxLayout
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel,BoxLayout.Y_AXIS));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        //Insertar Foto
        JLabel picture = new JLabel(new ImageIcon("src/imagenes/loro.png"));


        //añadir los botones de animales y la foto a un boxlayout
        JPanel Superior = new JPanel();
        Superior.setLayout(new BoxLayout(Superior,BoxLayout.X_AXIS));
        Superior.add(radioPanel);
        Superior.add(picture);
        getContentPane().add(picture,BorderLayout.CENTER);
        getContentPane().add(radioPanel,BorderLayout.WEST);
        getContentPane().setBackground(Color.BLUE);


        //añadir los botones horizontales a un BoxLayout
        JPanel HorizontalP = new JPanel();
        HorizontalP.setLayout(new BoxLayout(HorizontalP,BoxLayout.X_AXIS));
        HorizontalP.add(btnAceptar);
        HorizontalP.add(btnCancelar);
        HorizontalP.setBackground(Color.yellow);


        //panel principal
        JPanel Principal = new JPanel();
        Principal.setLayout(new BorderLayout());
        getContentPane().add(Superior, BorderLayout.NORTH);
        getContentPane().add(HorizontalP, BorderLayout.SOUTH);

        pack();
        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new agruparBotones("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);

        frame.pack();
        frame.setVisible(true);
    }
}

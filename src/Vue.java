
import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;

/**
 * Created by molipate on 18/04/15.
 */
public class Vue extends JFrame implements Constantes {

    private Panneau panneau;

    public Vue(Panneau panneau) {

        super();
        // Les 200 pixels sont la pour afficher les info sur le jeu en cours
        super.setSize(FENETRE_LARGEUR + 200, FENETRE_HAUTEUR);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panneau = panneau;
        this.setContentPane(panneau);
        super.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Created by molipate on 18/04/15.
 */
public class Panneau extends JPanel implements Constantes {

    private Model model; // Contient les données
    private Texture vide;
    private Texture tete_serpent;
    private Texture queue_serpent;
    private Texture corps_serpent;
    private Texture nourriture;
    private Texture mur;

    public Panneau(Model model){
        super();
        this.model = model;
        //TO DO (le triangle n'est pas encore implémenté) -> A voir dans Texture
        tete_serpent = new Texture(Forme.triangle, Color.green, 0, 0);
        queue_serpent = new Texture(Forme.triangle, Color.green, 0, 0);
        corps_serpent = new Texture(Forme.rectangle, Color.green, 20, 20);
        nourriture = new Texture(Forme.cercle, Color.red, 5, 5);
        mur = new Texture(Forme.rectangle, Color.gray, 20, 20);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < CASE_LARGEUR ; i++) {
            for (int j = 0; j < CASE_HAUTEUR ; j++) {

                switch (model.getCase(i, j)){
                    case MUR:
                        mur.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    case VIDE:
                        //vide.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    case TETE_SERPENT:
                        tete_serpent.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    case CORPS_SERPENT:
                        corps_serpent.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    case QUEUE_SERPENT:
                        queue_serpent.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    case NOURRITURE:
                        nourriture.drawTexture(g, i * TAILLE_BLOC, j * TAILLE_BLOC);
                        break;

                    default:
                        break;
                }
            }
        }
    }
}

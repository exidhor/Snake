import java.util.LinkedList;

/**
 * Created by molipate on 18/04/15.
 */
public class Model implements Constantes{
    /* === INFORMATIONS POUR LE CODEUR DU SERPENT / NOURRITURE ===
     * Ces deux classes doivent modifier le terrain.
     * Rajouter les sprites ou fournissez les images à Antoine pour l'affichage.
     */

    //private ContenuCase[][] terrain;
    private Jeu jeu;

    public Model(){

        jeu = new Jeu();

        /*this.terrain = new ContenuCase[CASE_LARGEUR][CASE_HAUTEUR];
        for (int i = 0; i < CASE_LARGEUR; i++) {
            for (int j = 0; j < CASE_HAUTEUR; j++) {
                this.terrain[i][j] = ContenuCase.VIDE;
            }
        }

        for (int i = 0; i < CASE_LARGEUR ; i++) {
            for(int j = 0; j < CASE_HAUTEUR; j++)
            {
                if(j == 0 || i == 0 || j == CASE_HAUTEUR - 1 || i == CASE_LARGEUR - 1)
                    this.terrain[i][j] = ContenuCase.MUR;
            }

        }*/
    }

    /*
    public ContenuCase getCase(int i, int j){
        return this.terrain[i][j];
    }

    public void addSerpent(LinkedList<Case> serpent)
    {
        for(int i = 0; i < TAILLE_SERPENT; i++)
        {
            terrain[serpent.get(i).getX()][serpent.get(i).getY()] = ContenuCase.CORPS_SERPENT;
        }
    }

    public void addNourriture(int posX, int posY)
    {
        terrain[posX][posY] = ContenuCase.NOURRITURE;
    }

    public void addMur(int posX, int posY)
    {
        terrain[posX][posY] = ContenuCase.MUR;
    }*/
}

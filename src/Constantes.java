
/**
 * Created by molipate on 18/04/15.
 */
public interface Constantes {

    public static final int FENETRE_LARGEUR = 800;
    public static final int FENETRE_HAUTEUR = 600;

    public static final int TAILLE_BLOC = 20;
    public static final int CASE_LARGEUR = FENETRE_LARGEUR / TAILLE_BLOC;
    public static final int CASE_HAUTEUR = FENETRE_HAUTEUR / TAILLE_BLOC;

    public static final int MUR = 0;
    public static final int HERBE = 1;

    /**
     *	Nombre de colonnes dans le jeu
     */
    public final static int NBRE_COLONNES = 30;

    /**
     *	Nombre de lignes dans le jeu
     */
    public final static int NBRE_LIGNES = 30;

    /**
     *	Taille de depart du serpent
     */
    public final static int TAILLE_SERPENT = 3;

    /**
     *	Position avec un serpent
     */
    public final static Case POS_DEPART_SERPENT = new Case(14,15);
}

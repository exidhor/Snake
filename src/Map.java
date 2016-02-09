import java.util.LinkedList;

/**
 * Created by jipay on 02/05/2015.
 */
public class Map implements Constantes{

    private ContenuCase[][] map;

    public Map()
    {
        map = new ContenuCase[NBRE_LIGNES][NBRE_COLONNES];

        genererMap();
    }

    public void genererMap()
    {
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                if(i == 0 || j == 0 || i == map.length - 1 || j == map[i].length)
                {
                    map[i][j] = ContenuCase.MUR;
                }
                else
                {
                    map[i][j] = ContenuCase.VIDE;
                }
            }
        }
    }

    public void addSerpent(LinkedList<Case> serpent)
    {
        for(int i = 0; i < TAILLE_SERPENT; i++)
        {
            map[serpent.get(i).getX()][serpent.get(i).getY()] = ContenuCase.CORPS_SERPENT;
        }
    }

    public void genererNourriture()
    {
        //TO DO
    }

    public void affichage() {
        //TO DO
    }

}

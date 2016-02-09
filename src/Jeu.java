import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Projet tut
 *
 */

/**
 *	Differentes actions du jeu
 */
public class Jeu implements Constantes, KeyListener {
	
	private Serpent serpent;
	private boolean laPartieEstPerdue;
	//private Nourriture nourriture;
	private Map map;

	/**
	 *	Creer une partie
	 */
	public Jeu() {
		this.serpent = new Serpent(POS_DEPART_SERPENT);
		this.laPartieEstPerdue = false;
		//this.nourriture = new Nourriture();
		map = new Map();
	}

	/**
	 *	Effectue les actions d'un tour de jeu
	 */
	public void calcul() {
		if(!this.laPartieEstPerdue) {
			this.serpent.calcul(this.nourriture);
			if(this.serpent.estMort()) {
				this.laPartieEstPerdue = true;
			}
		}
	}

	/**
	 *	Detection des touches du clavier
	 */
	public void gestionDuClavier(KeyEvent event) {
		//contenu deplacé dans KeyPressed(KeyEvent e)
	}
	
	/*
	 *	Retourne vrai si la partie est perdue
	 */
	public boolean getPartiePerdue() {
		return laPartieEstPerdue;
	}

	/**
	 *	Affichage du jeu
	 */
	public void affichage() {
		//TO DO
	}

	public Serpent getSerpent()
	{
		return serpent;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.serpent.setDemandeClavier(Direction.VERS_LA_DROITE);
			System.out.println("right");
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.serpent.setDemandeClavier(Direction.VERS_LA_GAUCHE);
			System.out.println("left");
		} else if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.serpent.setDemandeClavier(Direction.VERS_LE_HAUT);
			System.out.println("up");
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.serpent.setDemandeClavier(Direction.VERS_LE_BAS);
			System.out.println("down");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
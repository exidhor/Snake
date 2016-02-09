import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Texture extends JPanel implements Constantes {
		private Forme forme;

		//Cette classe Color appartient à swing : il faut donc mettre le nom de la variable
		//en anglais -> c'est pourquoi j'ai mis le nom de l'attribut en anglais, enjoy !
		private Color color;
		private int width;
		private int height;

		public Texture(Forme forme, Color color, int width, int height){
			this.color = color;
			this.forme = forme;
			this.width = width;
			this.height = height;
		}

		public void drawTexture(Graphics g, int posX, int posY){
			g.setColor(color);
			switch(forme)
			{
				case rectangle :
					g.fillRect(posX, posY, width, height);
					break;
				case cercle :
					g.fillOval(posX, posY, width, height);
					break;
				case triangle :
					//g.fillPolygon();
					break;
			}
		}
}

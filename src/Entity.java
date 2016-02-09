import java.awt.*;

/**
 * Created by jipay on 20/04/2015.
 */
public abstract class Entity {
    protected Texture texture;
    protected Case position;

    public Entity()
    {

    }

    public Case getPosition()
    {
        return position;
    }
}

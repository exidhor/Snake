
/**
 * Created by molipate on 18/04/15.
 */
public class Control {

    private Model model;
    private Panneau panneau;
    private Vue vue;
    private Jeu jeu;

    public Control(Model model) {

        this.model = model;
        this.panneau = new Panneau(model);
        this.vue = new Vue(panneau);
        jeu = new Jeu();
        model.addSerpent(jeu.getSerpent().getList());
    }
}

package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class DuestereWolke extends GraphicalObject {

    public DuestereWolke(double xPos, double yPos, double r) {
        //In diesem Framework hat jedes GraphicalObject
        //zwei Variablen (sogar mehr), die x, y und radius heißen.
        //Diese können einfach festgelegt werden.
        x = xPos;
        y = yPos;
        radius = r;
    }

    @Override
    public void  draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(153, 153, 153));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.drawFilledCircle(x + radius / 2, y + radius / 2, radius);
        drawTool.drawFilledCircle(x + radius, y, radius);
    }

    /**
     *
     */
    public void update(double dt){
        x = x + 50*dt;

    }
}

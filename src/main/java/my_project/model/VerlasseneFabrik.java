package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class VerlasseneFabrik extends GraphicalObject {


    public VerlasseneFabrik(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0x2D2929));
        drawTool.drawFilledRectangle(x, y, 100, 200);
        drawTool.setCurrentColor(new Color(0x36284C));
        drawTool.drawFilledTriangle(x, y,x+100,y,x+50,y-100);
        drawTool.setCurrentColor(new Color(0x000000));
        drawTool.drawFilledRectangle(x+40, y+100, 50, 100);
        drawTool.setCurrentColor(new Color(0x929292));
        drawTool.drawFilledRectangle(x+15, y+30, 20, 20 );
        drawTool.drawFilledRectangle(x+65, y+30, 20, 20);
        drawTool.setCurrentColor(new Color(0x070000));
        drawTool.drawRectangle(x+65, y+30, 20, 20);
        drawTool.drawRectangle(x+15, y+30,20,20);
        drawTool.setCurrentColor(new Color(0x897619));
        drawTool.drawFilledCircle(x+80, y+150, 4);
    }
}
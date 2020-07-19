package ru.bulat.figuremovement.modules;

import android.graphics.Canvas;

import ru.bulat.figuremovement.interfaces.ColorChangeable;

public class Ellipse extends Figure implements ColorChangeable {
    private int radiusX;
    private int radiusY;

    public Ellipse(Point position, int radiusX, int radiusY) {
        super(position);
        setRadiusX(radiusX);
        setRadiusY(radiusY);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void changeColor(int color) {

    }

    public int getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(int radiusX) {
        this.radiusX = radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(int radiusY) {
        this.radiusY = radiusY;
    }
}

package ru.bulat.figuremovement.models;

import android.graphics.Canvas;
import android.graphics.Color;

import ru.bulat.figuremovement.interfaces.ColorChangeable;

public class Ellipse extends Figure implements ColorChangeable {
    private int radiusX;
    private int radiusY;

    public Ellipse(Point position, int radiusX, int radiusY) {
        super(position);
        setRadiusX(radiusX);
        setRadiusY(radiusY);
        paint.setColor(Color.MAGENTA);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawOval(
                getPosition().getX() - (float) getRadiusX() / 2,
                getPosition().getY() - (float) getRadiusY() / 2,
                getPosition().getX() + (float) getRadiusX() / 2,
                getPosition().getY() + (float) getRadiusY() / 2,
                paint
        );
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
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

package ru.bulat.figuremovement.modules;

import android.graphics.Canvas;

public class Circle extends Figure {
    private int radius;

    public Circle(Point position, int radius) {
        super(position);
        setRadius(radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
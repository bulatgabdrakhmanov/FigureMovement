package ru.bulat.figuremovement.models;

import android.graphics.Canvas;
import android.graphics.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(Point position, int radius) {
        super(position);
        setRadius(radius);
        paint.setColor(Color.RED);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(
                getPosition().getX(),
                getPosition().getY(),
                getRadius(),
                paint
        );
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
package ru.bulat.figuremovement.modules;

import android.graphics.Canvas;

public abstract class Figure {
    private Point position;

    public Figure(Point position) {
        setPosition(position);
    }

    public abstract void draw(Canvas canvas);

    public void moveTo(int dx, int dy) {
        setPosition(new Point(position.getX() + dx, position.getY() + dy));
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}

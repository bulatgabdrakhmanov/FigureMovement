package ru.bulat.figuremovement.models;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Figure {
    private Point position;
    protected final Paint paint = new Paint();

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

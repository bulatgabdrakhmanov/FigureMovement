package ru.bulat.figuremovement.models;

import android.graphics.Canvas;
import android.graphics.Color;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Point position, int width, int height) {
        super(position);
        setWidth(width);
        setHeight(height);
        paint.setColor(Color.BLUE);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(
                getPosition().getX() - (float) getWidth() / 2,
                getPosition().getY() - (float) getHeight() / 2,
                getPosition().getX() + (float) getWidth() / 2,
                getPosition().getY() + (float) getHeight() / 2,
                paint
        );
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

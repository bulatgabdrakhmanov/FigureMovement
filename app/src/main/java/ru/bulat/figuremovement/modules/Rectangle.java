package ru.bulat.figuremovement.modules;

import android.graphics.Canvas;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Point position, int width, int height) {
        super(position);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw(Canvas canvas) {

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

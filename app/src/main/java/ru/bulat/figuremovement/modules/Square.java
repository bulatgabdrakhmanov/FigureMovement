package ru.bulat.figuremovement.modules;

import android.graphics.Canvas;

import ru.bulat.figuremovement.interfaces.ColorChangeable;

public class Square extends Figure implements ColorChangeable {
    private int width;

    public Square(Point position, int width) {
        super(position);
        setWidth(width);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void changeColor(int color) {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

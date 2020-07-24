package ru.bulat.figuremovement.models;

import android.graphics.Canvas;
import android.graphics.Color;

import ru.bulat.figuremovement.interfaces.ColorChangeable;

public class Square extends Figure implements ColorChangeable {
    private int width;

    public Square(Point position, int width) {
        super(position);
        setWidth(width);
        paint.setColor(Color.GREEN);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(
                getPosition().getX() - (float) getWidth() / 2,
                getPosition().getY() - (float) getWidth() / 2,
                getPosition().getX() + (float) getWidth() / 2,
                getPosition().getY() + (float) getWidth() / 2,
                paint
        );
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

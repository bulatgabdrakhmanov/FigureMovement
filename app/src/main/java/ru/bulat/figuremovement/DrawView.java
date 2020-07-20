package ru.bulat.figuremovement;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

import ru.bulat.figuremovement.interfaces.ColorChangeable;
import ru.bulat.figuremovement.modules.Circle;
import ru.bulat.figuremovement.modules.Ellipse;
import ru.bulat.figuremovement.modules.Figure;
import ru.bulat.figuremovement.modules.Point;
import ru.bulat.figuremovement.modules.Rectangle;
import ru.bulat.figuremovement.modules.Square;

public class DrawView extends View {
    private static final int STEP = 4;
    private final Random random = new Random(System.nanoTime());

    private int xDirection = 1;
    private int yDirection = 1;

    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public DrawView(Context context) {
        super(context);
        figures.add(new Circle(new Point(200, 500), 70));
        figures.add(new Circle(new Point(20, 600), 25));
        figures.add(new Square(new Point(400, 400), 50));
        figures.add(new Square(new Point(100, 100), 80));
        figures.add(new Rectangle(new Point(500, 950), 50, 40));
        figures.add(new Rectangle(new Point(getWidth() / 4, 900), 80, 40));
        figures.add(new Ellipse(new Point(getWidth() / 3, 500), 100, 50));
        figures.add(new Ellipse(new Point(getWidth() / 2, 800), 30, 50));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (Figure figure: figures) {
            figure.draw(canvas);
        }
    }

    @Override
    public void invalidate() {
        for (Figure figure: figures) {
            Point pos = figure.getPosition();

            if (pos.getX() <= 0) xDirection = 1;
            if (pos.getX() >= getWidth()) xDirection = -1;
            if (pos.getY() <= 0) yDirection = 1;
            if (pos.getY() >= getHeight()) yDirection = -1;

            figure.moveTo(
                    (STEP + random.nextInt(5)) * xDirection,
                    (STEP + random.nextInt(5)) * yDirection
            );
        }

        super.invalidate();
    }

    public void changeColors() {
        for (Figure figure: figures) {
            if (figure instanceof ColorChangeable) {
                ((ColorChangeable) figure).changeColor(
                        -random.nextInt(16777216)
                );
            }
        }
    }
}

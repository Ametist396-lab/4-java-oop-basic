package com.example.task04;

/**
 * Класс точки на плоскости
 */
public final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public Point flip() {
        return new Point(-x,-y);
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {
        int xx = this.x - point.x;
        int yy = this.y - point.y;
        return Math.sqrt(xx*xx + yy*yy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

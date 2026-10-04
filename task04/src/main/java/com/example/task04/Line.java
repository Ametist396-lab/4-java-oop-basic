package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){return p1;}
    public Point getP2(){return p2;}

    public boolean isCollinearLine(Point p){
        int dx1 = p.getX() - p1.getX();
        int dy1 = p.getY() - p1.getY();
        int dx2 = p2.getX() - p1.getX();
        int dy2 = p2.getY() - p1.getY();
        return dx1 * dy2 - dx2 * dy1 == 0;
    }

    @Override
    public String toString() {
        return "(" + p1 + " -> " + p2 + ")";
    }
}

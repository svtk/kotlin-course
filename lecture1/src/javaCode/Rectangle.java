package javaCode;

public class Rectangle {
    private final int width;
    private final int height;
    private final boolean isSquare;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.isSquare = width == height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isSquare() {
        return isSquare;
    }
}

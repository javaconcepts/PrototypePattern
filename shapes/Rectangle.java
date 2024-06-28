package PrototypePattern.shapes;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.height = target.height;
            this.width = target.width;
        }
    }

    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Rectangle) || !super.equals(object))
            return false;

        Rectangle shape = (Rectangle) object;
        return shape.width == width && shape.height == height;
    }
}

package lang.Object.test;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if(obj == null || getClass() != obj.getClass()){
            return  false;
        }
        Rectangle rectangle=(Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;
    }
}

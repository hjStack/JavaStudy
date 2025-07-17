package lang.Object.test;

public class Rectangle {

    int width;
    int height;

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
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return  false;
        }
        Rectangle rect=(Rectangle) obj;
        return width == rect.width && height == rect.height;
    }
}

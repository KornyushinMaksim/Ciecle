public class Circle extends Figure {

    private float radius;

    public Circle (){
        this.radius = 10;
    }

    public Circle (int radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float squareFigure(float a, float b) {
        return 3.1415f * (float)(Math.pow(this.radius, 2));
    }

    @Override
    public float perimeterFigure(float a, float b) {
        return 2 * 3.1415f * this.radius;
    }
}

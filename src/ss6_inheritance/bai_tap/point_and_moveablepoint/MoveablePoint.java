package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class MoveablePoint extends Point{
    private static float xSpeed = 0.0f;
    private static float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arr = new float[]{this.xSpeed, this.ySpeed};
        return arr;
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

package pack01;

public class MovePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovePoint(){}

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
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
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                " x = " + getX() +
                " y = " + getY() +
                '}';
    }
    public void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}

class Test{
    public static void main(String[] args) {
        MovePoint obj = new MovePoint(2,3,4,5);
        System.out.println(obj);
        obj.move();
        System.out.println(obj);
    }
}

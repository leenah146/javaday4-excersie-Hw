public class ball {
   private float x;
   private float y;
   private  int radius;
   private  float yDelta;
   private  float xDelta;

    public ball(float x, float y, int radius, float yDelta, float xDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.yDelta = yDelta;
        this.xDelta = xDelta;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x=x;

    }
    public float gety() {
        return y;
    }
    public void sety(float y) {
        this.y=y;

    }
    public int getRadius(){return radius; };
    public void setRadius(int radius){
        this.radius=radius;
    }

    public float getxDelta() {
        return x;
    }
    public void setxDelta(float xDelta) {
        this.xDelta=xDelta;

    }
    public float getyDelta() {
        return y;
    }
    public void setyDelta(float yDelta) {
        this.yDelta=yDelta;

    }

    public void move(){
    this.x+this.xDelta;
     this.y+this.yDelta;
    }
    public void reflectHorizontal(){
     setxDelta(-this.getxDelta());
        
        
    }
    public void reflectvertical(){
    
         setyDelta(-this.getyDelta());
    
    }

}

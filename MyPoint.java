public class MyPoint {
   private int x;
   private int y;
    
   public my point(){
    
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int XY[]=new int[2];
        int arr[]={this.x,this.y};
        return arr;
    }
    public void setXY(int x ,int y){
     setX(x);
     setY(y);   
        
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x,int y){
        //
       
        return Math.sqrt(Math.pow()this.x-x,2)+Math.pow(this.y-y,2) ;
    }
    
    
    public double distance(MyPoint mypoint){
        //
       
        return Math.sqrt(Math.pow()this.x-mypoint.getX(),2)+Math.pow(this.y-mypoint.gety(),2) ;
       
    }
    
    
      public double distance(MyPoint mypoint){
        //
       
        return Math.sqrt(Math.pow()this.x-mypoint.getX(),2)+Math.pow(this.y-mypoint.gety(),2) ;
       
    }


}

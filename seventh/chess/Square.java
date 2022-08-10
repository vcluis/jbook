public class Square{
    /*
    private int x;
    private int y;
    */
    private boolean isVisited;

    public Square(){}

    public Square(boolean isVisited){
        this.isVisited = isVisited;
    }

    /*
    public Square(int x, int y, boolean isVisited){
        this.x = x;
        this.y = y;
        this.isVisited = isVisited;
    }
    */

    /*
    public void setX(int x){
        this.x = x;
    }

    public int getX(){return x;}

    public void setY(int y){
        this.y = y;
    }

    public int getY(){return y;}
    */

    public void setIsVisited(boolean isVisited){
        this.isVisited = isVisited;
    }

    public boolean getIsVisited(){return isVisited;}
}

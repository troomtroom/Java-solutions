public class Point{
    private double x;
    private double y; 

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(Point A){
        double dx = this.x - A.getX();
        double dy = this.y - A.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public Point midPoint(Point a){
        return new Point((this.x + a.getX())/2,(this.y + a.getY())/2);
    }

    public double angleTo(Point a){
        double dy = -((this.y) - a.getY());
        double dx = -((this.x) - a.getX());
        return Math.atan2(dy,dx);
    }

    @Override
    public String toString(){
        return "("+ String.format("%.3f",x)+", " + String.format("%.3f",y)+")";
    }
}
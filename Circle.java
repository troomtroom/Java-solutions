public class Circle{
    private Point p;
    private Point q;

    public Circle(Point p, Point q){
        this.p = p;
        this.q = q;
    }
    public Point myP(){
        return p;
    }
    
    public Point getQ(){
        return q;
    }

    public Point getCentre(){
        Point m = p.midPoint(q);
        double pm = p.distance(m);
        double t = p.angleTo(q);
        double cm = Math.sqrt(1-pm*pm);
        return new Point(m.getX() + cm*Math.cos(t + Math.PI/2), 
                         m.getY() + cm*Math.sin(t + Math.PI/2));
    }

    public boolean contains(Point P){
        return this.getCentre().distance(p) <= 1;
    }
    @Override
    public String toString(){
        return p.toString()+" and " + q.toString() + " coincides with circle of centre " + getCentre();
    }
}
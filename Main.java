import java.util.*;
public class Main{
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           Point[] points=new Point[t];
           for(int i=0;i<points.length;i++){
               points[i]=new Point(sc.nextDouble(),sc.nextDouble());
           }   
           int max=0;
          for(int i=0;i<points.length;i++){
             Circle c;
              for(int j=i;j<points.length;j++){
                  int m=0;
                  if(points[i].distance(points[j])>2) continue;
                  else{
                      c=new Circle(points[i],points[j]);
                      for(int l=0;l<points.length;l++){
                          if(c.contains(points[l])){
                              m++;
                         }   
                     }   
                  }   
                  if(m>max)max=m;
              }
          }
          System.out.println("Maximum Disc Coverage: "+max);
      }
  }
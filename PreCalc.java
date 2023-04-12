import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PreCalc {
    /*
    visualize vectors
    plot points
    add subtract scale vectors
    unit vectors
    direction of vecotrs
    -----

    3 point coordinate system
    set  notation {(x,y)|
                x,y in real numbers}
     y
     |
     |
     |
     |_________x
         z
         |
         |
         |
         |
         |
         |_________________y
        /
       /
      /
     /
     x

     Distance Formula
     if p(x1,y1), q(x2,y2) in R2 then
            |PQ| = sqrt((x1-x2)^2+(y1-y2)^2))
        if p(x1,y1,z1), q(x2,y2,z2) in R2 then
            |PQ| = sqrt((x1-x2)^2+(y1-y2)^2)+(z1-z2)^2)

      Spheres
       r^2=(x-a)^2+(y-b)^2
       set {x,y| r=sqrt((x-a)^2+(y-b)^2)

       r^3
       {(x,y,z)|r=sqrt((x-a)^2+(y-b)^2+(z-c)^2)}


       Vectors
       Vectors vs points
       -both are ordered "tuples" (list) of numbers
       -in R2, pairs: P(x,y), vec = <x,y>
       -in R3, triples:P(x,y,z), vec = <x,y,z>
       difference is visualization/do

       Vector Formally
       a vector is a difference between 2 points

       a vector between 3 points
       vec = Q(a,b,c)-P(x,y,z)
       =<a-x,b-y,c-z>

       Planes
       xy yz

       The law of Cosines**
6/23
Vector addition
Scalar multiplication: scalar s<x,y,z> = <sx,sy,sz>
    Properties of vectors. V_n = v set of all N-dimensional vectors.
     -1 scalar flips tail and tip.




 Are these points in a straight line?
    |AB|+|BC| = |AC|
    |AB| = sqrt((ax-bx)^2+(ay-by)^2+(az-bz)^2)
    |BC| = sqrt((bx-cx)^2+(by-bc)^2+(bz-cz)^2)
    if |AB|+|BC| = |AC| then ABC are in a straight line.
 The Dot product   vector * vector = scalar (Real numb)
 The Cross product  vector cross vector = perpendicular vector right hand rule thumb.
       vec a perpendicular vec b if and only if cos theta is 0 == theta = pi/2 or 3pi/2.
       vec a  <a1,a2,a3>, vec b = <b1,b2,b3>; we want vec c = <c1,c2,c3>
       such that vec c perp vec a && vec c perp vec b
       *a1c1+a2c2+a3c3 = O  && b1c1+b2c2+b3c3 = 0
       eliminate c3
            a1b3c1+a2b3c2-a3b1c1-a3b2c2=0
            (a1b3-a3b1)c1+(a2b3-a3b2)c2=0
            then Ac1 + Bc2 = 0  and c1=B , c2 =-A
                            c3 = a1b2-a2b1
       The Dot Product
            (vec a dot vec b) and retruns a scalar.
                You cant take a dot product of a scalar and a vector c it must be two vectors.
        Theorem   vec a dot vec b = |vec a||vec b|cos theta.
       Learn law of cosines
            review
            triangle abc  let theta = m(angle abc)
                then c^2 = a^2+b^2 - 2ab cos(theta)
                this can be written as: |vec a - vec b|^2 = |vec a|^2 + |vec b|^2 - 2|vec a||vec b| cos(theta)
        recall vec * vec = |vec|^2
        then   |vec a - vec b|^2 = (vec a - vec b)*(vec a - vec b) = vec a
        //2.5 lecture

        //6/29/2021
            Scalar Projection from vec b on vec a
            =(vec b dot vec a)/magnitude(vec a)

            Vector projection from b onto a
            =((vec b dot vec a)/magnitude(vec a)^2 * vec a)
888888888888
            Infinite series, f = N -> R   natural number = N = <0,1,2,3,4......>
            f = R -> R























                 */




   public void crossProduct(){


       System.out.println("input 6 real vectors=");
        Random random = new Random();
        Scanner scan  = new Scanner(System.in);
        int u1, u2, u3, v1, v2, v3;

        u1 = scan.nextInt(); //random.nextInt(10);

        u2 = scan.nextInt(); //random.nextInt(10);

        u3 = scan.nextInt(); //random.nextInt(10);

        v1 = scan.nextInt();// random.nextInt(10);

        v2 = scan.nextInt();//random.nextInt(10);

        v3 = scan.nextInt();// random.nextInt(10);



        int uvi, uvj, uvk;

        uvi = u2 * v3 - v2 * u3;

        uvj = v1 * u3 - u1 * v3;

        uvk = u1 * v2 - v1 * u2;



        System.out.println("The cross product of the 2 vectors \n u = " + u1

                + "i + " + u2 + "j + " + u3 + "k and \n v = " + v1 + "i + "

                + v2 + "j + " + v3 + "k \n ");

        System.out.println("u X v : " + uvi + "i +" + uvj + "j+ " + uvk + "k ");

    }
    private void dotProduct() {
        Scanner scan  = new Scanner(System.in);
        int u1, u2, u3, v1, v2, v3,prod;
        System.out.print("first x value: ");
        u1 = scan.nextInt();

        System.out.print("first y value: ");
        u2 = scan.nextInt();

        System.out.print("first z value: ");
        u3 = scan.nextInt();

        System.out.print("second x value: ");
        v1 = scan.nextInt();

        System.out.print("second y value: ");
        v2 = scan.nextInt();

        System.out.print("second z value: ");
        v3 = scan.nextInt();

        prod = u1*v1+u2*v2+u3*v3;
        System.out.println("<"+u1*v1+"i, "+u2*v2+"j, "+u3*v3+"k>");
        System.out.println("dot product = "+prod+" if 0 then it is orthogonal. it is perpendicular if prod is divisible by both y values.");
   }
   public void vectorFromTwoPoints(){
       Scanner scan  = new Scanner(System.in);
       int u1, u2, u3, v1, v2, v3;
       System.out.println("First x: ");
       u1 = scan.nextInt();//x1
       System.out.println("First y: ");
       u2 = scan.nextInt();//y1
       System.out.println("First z: ");
       u3 = scan.nextInt();//z1
       System.out.println("Second x: ");
       v1 = scan.nextInt();//x2
       System.out.println("Second y: ");
       v2 = scan.nextInt();//y2
       System.out.println("Second z: ");
       v3 = scan.nextInt();//z2
       System.out.println("<"+(v1-u1)+","+(v2-u2)+","+(v3-u3)+">");
   }
   public double magnitude(){
       Scanner scan  = new Scanner(System.in);
       double x, y, z;
       System.out.println("x: ");
       x = scan.nextDouble();
       System.out.println("y: ");
       y = scan.nextDouble();
       System.out.println("z: ");
       z = scan.nextDouble();
       System.out.print("The magnitude is: ");
       return (x*x+y*y+z*z);
   }
   public String areaOfTriangle(){//TODO use two vectors to find area and divide by two.
       Scanner scan  = new Scanner(System.in);
       double x1, y1, z1, x2, y2, z2, x3, y3, z3;
       System.out.println("First x: ");
       x1 = scan.nextDouble();
       System.out.println("First y: ");
       y1 = scan.nextDouble();
       System.out.println("First z: ");
       z1 = scan.nextDouble();
       System.out.println("Second x: ");
       x2 = scan.nextDouble();
       System.out.println("Second y: ");
       y2 = scan.nextDouble();
       System.out.println("Second z: ");
       z2 = scan.nextDouble();
       System.out.println("Third x: ");
       x3 = scan.nextDouble();
       System.out.println("Third y: ");
       y3 = scan.nextDouble();
       System.out.println("Third z: ");
       z3 = scan.nextDouble();
      // double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
       return("Area of Triangle is " /* + area*/);

   }
        public static void main(String[] args) {
           PreCalc calc = new PreCalc();
           // calc.vectorFromTwoPoints();
           //calc.crossProduct();
            //System.out.println( calc.magnitude(30,-14,12));
            //System.out.println( calc.magnitude(2,-1,1));
            //System.out.println( calc.magnitude(1,-2,-4));
            Scanner scan = new Scanner(System.in);
            boolean flag = true;
            System.out.println("Options: dot, cross, area of a triangle, magnitude, vector from two points \n");
            String input = scan.next();
            while(flag){
                switch(input){
                    case "exit":
                        flag = false;
                        break;
                    case "dot":
                        calc.dotProduct();
                        input = scan.next();
                        break;
                    case "cross":
                        calc.crossProduct();
                        input = scan.next();
                        break;
                    case "area of a triangle":
                        calc.areaOfTriangle();
                        input = scan.next();
                        break;
                    case "magnitude":
                        calc.magnitude();
                        input = scan.next();
                        break;
                    case "vector from two points":
                        calc.vectorFromTwoPoints();
                        input = scan.next();
                        break;


                    default:
                        System.out.println("default");
                        input = scan.next();
                        break;

                }
            }

            //calc.dotProduct();
        }


}


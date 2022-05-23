package basic.ch4;

public class Triangle {
    private int x1,x2,x3;
    private int y1,y2,y3;

    public Triangle(int x1,int x2,int x3,int y1,int y2,int y3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }
    private float TrianglelengthA(){
        float a=(float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return a;
    }
    private float TrianglelengthB(){
        float b=(float) Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        return b;
    }
    private float TrianglelengthC(){
        float c=(float) Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        return c;
    }

    public float Perimeter(){
        float perimeter=TrianglelengthA()+TrianglelengthB()+TrianglelengthC();
        return perimeter;
    }
    public float TriangleArea(){
        float p= (float) (Perimeter()/2.0);
        float area=(float) Math.sqrt(p*(p-TrianglelengthA())*(p-TrianglelengthB())*(p-TrianglelengthC()));
        return area;
    }
    public void Move(int x,int y){
        x1+=x;
        x2+=x;
        x3+=x;
        y1+=y;
        y2+=y;
        y3+=y;
    }
    public void Spin(){
        x1=-x1;
        x2=-x2;
        x3=-x3;
        y1=-y1;
        y2=-y2;
        y3=-y3;
    }

    @Override
    public String toString() {
        return "Location[(" +x1 + "," + y1 + "),(" + x2 +","+ y2 +"),(" + x3 + "," + y3 +")]";
    }
}

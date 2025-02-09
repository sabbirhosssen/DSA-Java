package java_lab4;
public class Vector3D {
    public double x;
    public double y;
    public double z;

    public Vector3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Vector3D add(final Vector3D v){
        return new Vector3D(this.x+v.x, this.y+v.y,this.z+v.z );

    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
    public static void main(String[] args){
        Vector3D v1 = new Vector3D(1.0,2.0,3.0);
        Vector3D v2 = new Vector3D(4.0,5.0,6.0);

        Vector3D result = v1.add(v2);
        System.out.println(result);
    }

}
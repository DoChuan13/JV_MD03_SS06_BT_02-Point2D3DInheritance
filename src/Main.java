import point.Point2D;
import point.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);
        System.out.println(point2D);
        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println(point3D);
        /*Test ep kieu du lieu =>> chỉ co dung dung phu hop cho kieu du lieu so, object không thay phu hop*/
        System.out.println("----------3D to 2D----------");
        Point2D over2D = point3D;
        System.out.println("3D to 2D (Before) ==> " + over2D);
        over2D.setXY(20, 30);
        System.out.println("3D to 2D (After) ==> " + over2D);
        /*Test ep kieu du lieu =>> chỉ co dung dung phu hop cho kieu du lieu so, object không thay phu hop*/
        System.out.println("----------2D to 3D----------");
        Point2D test2D = new Point3D(10, 22, 33);
        Point3D test3D = (Point3D) test2D;
        System.out.println("2D to 3D (Before base core is 3D) ==> " + test2D);
        test3D.setXYZ(12, 33, 55);
        System.out.println("2D to 3D (After base core is 3D) ==> " + test2D);
    }
}

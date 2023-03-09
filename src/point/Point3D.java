package point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point 3D {" +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + getZ() +
                '}';
    }
}

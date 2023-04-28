public class Arrow {
    private int fx;              // front x
    private int fy;              // front y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit
    private int bx;              // back x
    private int by;              // back y

    public Arrow()
    {
         this(100,100,0,100,0,0);
    }

    public Arrow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }
    public void setCenter(int xIn, int yIn)
    {

    }

    public int getFx() {
        return fx;
    }

    public int getFy() {
        return fy;
    }

    public int getBx() {
        return bx;
    }

    public int getBy() {
        return by;
    }
}

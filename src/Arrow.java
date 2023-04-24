public class Arrow {
    private int x;              // Center x
    private int y;              // Center y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit


    public Arrow()
    {
         this(200, 300,0,0, 10);
    }

    public Arrow(int xIn, int yIn, int dxIn, int dyIn, int i)
    {
        x = xIn;
        y = yIn;
        dx = dxIn;
        dy = dyIn;
    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }

}

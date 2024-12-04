public class ColorDemo
{
    public static final String SET_RED = "\u001b[41m";
    public static final String SET_BLACK = "\u001b[40m";
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static void main(String[] args) throws Exception
    {
        for(int i = 0; i < 350; i++)
        {
            runFrame(i);
            Thread.sleep(35);
        }
    }

    
    public static void runFrame(int frameno)
    {
        double frequency = Math.abs(frameno % 50 - 25) / 3.0;
        double amplitude = Math.sin(0.03 * frameno) * 10 + 1;

        boolean[][] framedata = new boolean[27][75];

        int stepconstant = 5;
        if(Math.abs(frequency) > 2)
            stepconstant = 2;
        if(Math.abs(frequency) > 3.5)
            stepconstant = 1;

        for(int i = 0; i < 750; i += stepconstant)
        {
            int sineheight = (int)(Math.sin(frequency * (i - 375) * 0.01) * amplitude);
            framedata[sineheight + 11][i / 10] = true;
        }

        System.out.print(CLEAR_SCREEN);

        for(int y = 0; y < 27; y++)
        {
            for(int x = 0; x < 75; x++)
            {
                System.out.print(framedata[y][x] ? getcolorString(frameno) : SET_BLACK);
                System.out.print(" ");
                System.out.print(SET_BLACK);
            }
            System.out.print("\n");
        }
    }

    public static String getcolorString(int i)
    {
        return "\u001b[" + (41 + (i / 50)) + "m";
    }
}
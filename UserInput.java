public class UserInput{
    public static String move = "w";
    public static int length = 1;
    //Correlates with row.
    public static int y = 12;
    //Correlates with column.
    public static int x = 12;

    public UserInput(String move)
    {
        UserInput.move = move;
        // Location of snake's head is defined by x, y coordinates.
        setY();
        setX();
    }

    public void setY()
    {
        if(move.equals("d"))
        {
            x = x + 1;
        }
        else if(move.equals("a"))
        {
            x = x - 1;
        }
    }

    public void setX()
    {
        if(move.equals("w"))
        {
            y = y - 1;
        }
        else if(move.equals("s"))
        {
            y = y + 1;
        }
    }

    public static int getX()
    {
        return x;
    }

    public static int getY()
    {
        return y;
    }

    public static int newX()
    {
        return x = 6;
    }

    public static int newY()
    {
        return y = 6;
    }

}

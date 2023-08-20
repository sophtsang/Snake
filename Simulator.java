import java.io.Console;
//import java.util.Arrays;

public class Simulator{
    //public int length = 1;
    static Console cnsl = System.console();
    public static void main(String args[])
    {
        System.out.println("The Snake Game.\nUsing WASD controls, get the snake to grow by eating EGGS!");
        while(UserInput.length < 6)
        {
            MatrixCell matrix = new MatrixCell();
            //System.out.println(Cell.printCell());
            System.out.println(matrix.printStrCell());
            String direction = cnsl.readLine("_______________________________ Move: ");
            UserInput misterSnake = new UserInput(direction);
        }
        System.out.println("\nYour snake has grown into a huge CHONK!\n");
    }


}

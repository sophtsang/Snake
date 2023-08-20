import java.io.Console;
import java.util.Arrays;

public class MatrixCell{
    static Console cnsl = System.console();
    //public boolean qualified;
    //public Cell[][] cell;
    public static boolean again = true;
    //public String food = " @ ";

    public MatrixCell(){
    }

    public String[][] printMatCell()
    {
        //For some reason.
        String[][] cell = new String[13][13];

        //Nested for loop that adds empty or snake into matrix cells, where x is rows and y is columns.
        for(int row = 0; row < 13; row++)
        {
            for(int col = 0; col < 13; col++)
            {
                cell[row][col] = "   ";
                //Length determines how many times following loop runs. Initial length = 1.
                if(row == UserInput.getY() && col == UserInput.getX())
                {
                    for(int i = 0; i < UserInput.length; i++)
                    {
                        try{
                            //Code that moves around snake based on "WASD" controls.
                            if((UserInput.move).equals("w") || (UserInput.move).equals("s"))
                            {
                                cell[row-i][col] = " | ";
                            }
                            if((UserInput.move).equals("a") || (UserInput.move).equals("d"))
                            {
                                cell[row][col-i] = "___";
                            }
                        } 
                        catch(Exception e)
                        {
                            System.out.println("\nCRASH! The snake is shrinking! \nReturning to boundaries...\n");
                            UserInput.length = 1;
                            UserInput.newX();
                            UserInput.newY();
                            AddFood.getRandom();
                        }
                    }
                }
            }
        }

        //Move this to AddFood.java when possible.
        if(UserInput.length == 1 && again == true)
        {
            AddFood.getRandom();
            again = false;
        }
        else if(cell[AddFood.foodRow][AddFood.foodCol].equals(" | ") || cell[AddFood.foodRow][AddFood.foodCol].equals("___"))
        {
            UserInput.length++;
            System.out.println("\nFood is eaten!\nThe snake grows...\n");
            AddFood.getRandom();
            again = true;
        }
        while(!(cell[AddFood.foodRow][AddFood.foodCol]).equals("EGG") && UserInput.length < 6)
        {
            cell[AddFood.foodRow][AddFood.foodCol] = "EGG";
            System.out.println("\nFood is here! _________________________\n");
        }
        return cell;
    }

    public String printStrCell()
    {
        String cell = Arrays.deepToString(printMatCell());
        cell = cell.replace("[[", ", [");
        cell = cell.replace("[", "");
        cell = cell.replace("]", "\n");
        cell = cell.replace(", ", "");
        return cell;
    }

}

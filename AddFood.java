import java.util.Arrays;

public class AddFood extends MatrixCell{
    public static int foodRow;
    public static int foodCol;

    public AddFood(){
    }

    public static void getRandom()
    {
        foodRow = (int)(Math.random() * 8);
        foodCol = (int)(Math.random() * 8);
    }

    public String getCell()
    {
        String[][] cell = printMatCell();
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
        return cell[AddFood.foodRow][AddFood.foodCol];
    }
}
package SteppingStones;

import java.util.ArrayList;

/**
 *
 * @author Gavins
 */

public class RecipeBox {
    
    private ArrayList<RecipeBox> listOfRecipes = new ArrayList();

    /**
     * @param listOfRecipes 
     */

    public ArrayList<RecipeBox> getListOfRecipes() {
        return listOfRecipes;
    }
    
    /**
     * @return the list of recipes 
     */
	
    public void setListOfRecipes(ArrayList<RecipeBox> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    public RecipeBox() {
        this.listOfRecipes = new ArrayList<RecipeBox>();
    }
    

	 
    
    	public void printAllRecipeDetails() {
            SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe();
            int i = 0;
            for (i = 0; i < listOfRecipes.size(); i++) {
               recipe1.printRecipe();
               
		}
	}
        
        
        
        public void listOfRecipes() {
            int i = 0;
            for (i = 0; i < listOfRecipes.size(); i++) {
                System.out.println(listOfRecipes.get(i));
            }
            return;
        }
        
        public static void main (String[] args) {
        ArrayList<RecipeBox> objList = new ArrayList<RecipeBox>();
      
        RecipeBox.add(new String(""));
      
        PrintArrayList(SteppingStone6_RecipeBox);
      
      return;
        }
        
        
	
	public static void main(String[] args) {
 
        RecipeBox myRecipeBox = new RecipeBox();
        Scanner menuScnr = new Scanner(System.in);
        
       
		
    System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();

			
	if (input == 1) {
            newRecipe();
        }
        
        else if (input == 2) {
            System.out.println("Which recipe?\n");
            String selectedRecipeName = menuScnr.next();
            printAllRecipeDetails(selectedRecipeName);
            
            
            } 
        
        else if (input == 3) {
            for (int j = 0; j < listOfRecipes.size(); j++) { 
            System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName()); 
            }
            } 
        
        else {
            System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
        }
            

			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
        
	}

}


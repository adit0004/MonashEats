import java.util.ArrayList;
/**
 * A collection of items served by a restaurant
 *
 * @author Yupu Li
 * @version 7/5/2019
 */
public class Menu
{
    ArrayList<Items> items;
    
    /**
     * Default constructor
     */
    public Menu()
    {
        items = new ArrayList<Items>();
    }
    
    /**
     * Parameterized constructor
     */
    public Menu(ArrayList<Items> newItems)
    {
        items = newItems;
    }
    
    public void showMenu(){
        System.out.
    }

    public void addItems(Items item){
        boolean existed=false;
        for(int i :  items){
            if(item == items.get(i)){
               existed=true;
            }
        }
        if(existed){
            System.out.println("This item is existed! Please try again!");
        }else{
            items.add(item);
        }
    }
    public void removeItems(Item item){
        boolean existed=false;
        ArrayList<Items> items= item;
        for(int i : items){
            if(item.equalitems.get(i)){
               existed=true;
            }
        }
        if(existed){
            items.remove(item);
            System.out.println("This item has been removed successfully!");
        }else{
            System.out.println("This item does not exist! Please try again!");
        }       
    }
}

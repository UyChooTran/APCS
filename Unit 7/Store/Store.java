
import chn.util.*;
import apcslib.*;
public class Store
{

    private Item[] myStore;

    public Store(String fileName) 
    {
        FileInput in = new FileInput(fileName);
        myStore = new Item[in.readInt()];
        int temp, temp1;
        for(int x = 0; x < myStore.length; x++)
        {
            temp = in.readInt();
            temp1 = in.readInt();
            myStore[x] = new Item(temp,temp1);
        }
    }		

    public void displayStore()				// displays the data
    {
        System.out.println(Format.right("ID",12) + Format.right("Inv",12));
        for(int x = 0; x < myStore.length; x++)
        {
            if(x % 10 == 0)
                System.out.println();

            System.out.println("" + (x+1) + Format.right("" + myStore[x].getId(),12) + Format.right("" + myStore[x].getInv(),12));
        }
    }

    public void doSort()					// public method that calls 'quickSort' of 'myStore'
    {
        quickSort(myStore, 0, myStore.length - 1);	// code as shown
    }

    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO console = new ConsoleIO();

        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = console.readInt();
        while (idToFind >= 0)
        {
            // calling iterative version of binary search  
            index = bsearch(new Item(idToFind, 0));
            System.out.print("Iterative binary search: Id # " + idToFind);
            if (index == -1)
                System.out.println("     No such part in stock");
            else
                System.out.println("     Inventory = " + myStore[index].getInv());

            // calling recursive version of binary search
            index = bsearch (new Item(idToFind, 0), 0, myStore.length-1);
            System.out.print("Recursive binary search: Id # " + idToFind);
            if (index == -1)
                System.out.println("     No such part in stock");
            else
                System.out.println("     Inventory = " + myStore[index].getInv());	

            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        }
    }

    /**
     *  Searches the myStore array of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @return             index of Item if found, -1 if not found
     */
    int bsearch(Item idToSearch)
    {
        return -1;
    }

    /**
     *  Searches the specified array of Item Objects for the specified
     *  item object using a recursive binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found
     */ 
    int bsearch (Item idToSearch, int first, int last)
    {
        return -1;
    }


    public static void main (String[] args)	
    {
        Store miniMart = new Store("file50.txt");
        System.out.println("Database before sorted: ");
        System.out.println();
        miniMart.displayStore();
        miniMart.doSort();
        System.out.println();
        System.out.println("Database after sorted by id: ");
        System.out.println();
        miniMart.displayStore();
    }
}
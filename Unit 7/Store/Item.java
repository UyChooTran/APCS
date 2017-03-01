public class Item implements Comparable<Item>

{
  private int myId;
  private int myInv;
  
  public Item(int id, int inv)
  {
    myId = id;
    myInv = inv;
  }
  
  public int getId()
  {
      return this.myId;
    }
    
  public int getInv()
  {
      return this.myInv;
    }
    
  public int compareTo(Item otherObject)
  {
    return(this.getId() - otherObject.getId());
    
  }
  
  public boolean equals(Item otherObject)
  {
      return this.compareTo(otherObject) == 0;
    }
    
  public String toString()
  {
      return "" + myId;
    }
}

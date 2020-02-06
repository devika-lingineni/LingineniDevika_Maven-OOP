import devika.devi.Gift;

public class Items implements Gift {
   int itemWeight;
   String itemName;
   String itemType;
    public Items(int itemWeight,String itemName,String itemType)
    {
        this.itemWeight=itemWeight;
        this.itemName=itemName;
        this.itemType=itemType;

    }
    public Items() {
        // TODO Auto-generated constructor stub
    }
    public int totalWeight(int chocTotalWeight)
    {
        return chocTotalWeight;
    }
    public int totalWeight(int chocTotalWeight,int sweetWeight)
    {
        int totalweight=chocTotalWeight+sweetWeight;
        return totalweight;
    }

}

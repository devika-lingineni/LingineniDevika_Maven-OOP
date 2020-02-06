import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;


public class App
{
    public static void main( String[] args )
    {
        Items i1=new Items(10,"5 Star","Chocolates");
        Items i2=new Items(15,"Dairy Milk","Chocolates");
        Items i3=new Items(20,"Fuse","Chocolates");
        Items i4=new Items(25,"Kit Kat","Chocolates");
        Items i5=new Items(30,"Candies","Chocolates");
        Items i6=new Items(35,"Laddu","Sweets");
        Items i7=new Items(40,"Kova","Sweets");
        Items i8=new Items(45,"Mysore Pak","Sweets");
        Items i9=new Items(50,"Chikki","Sweets");
        Items i10=new Items(55,"Gavvalu","Sweets");
        ArrayList<Items> al=new ArrayList<Items>();
        //ArrayList<Sweets> sl=new ArrayList<Sweets>();
        ArrayList<Items> cl=new ArrayList<Items>();
        int chocTotalWeight=0;
        int sweetWeight=0;
        al.add(i1);
        al.add(i2);
        al.add(i3);
        al.add(i4);
        al.add(i5);
        al.add(i6);
        al.add(i7);
        al.add(i8);
        al.add(i9);
        al.add(i10);
        Iterator itr=al.iterator();
        while(itr.hasNext()) {

            Items it=(Items)itr.next();
            if(it.itemType=="Chocolates")
            {
                Chocolates c=new Chocolates();
                c.setitemName(it.itemName);
                c.setitemType(it.itemType);
                c.setitemWeight(it.itemWeight);
                System.out.println("Chocolate Items:    " +c.getitemName());
                chocTotalWeight=chocTotalWeight+it.itemWeight;
            }
            if(it.itemType=="Sweets")
            {
                Sweets s=new Sweets();
                s.setitemName(it.itemName);
                s.setitemType(it.itemType);
                s.setitemWeight(it.itemWeight);
                System.out.println("Sweet Item:     "+s.getitemName());
                sweetWeight=sweetWeight+it.itemWeight;
            }

            if(it.itemName=="Candies")
            {
                System.out.println("Candies Weight:    "+it.itemWeight);
            }

            //	System.out.println(it.itemWeight+" "+it.itemName+" "+it.itemType);
        }


        System.out.println("total weight of choclate gifts: "+chocTotalWeight);
        System.out.println("total weight of sweet gifts: "+sweetWeight);
        Items w=new Items();
        w.totalWeight(chocTotalWeight);
        w.totalWeight(chocTotalWeight,sweetWeight);



 /*Collections.sort(cl,Items.itemName);
	for(Items str: cl)
	{
		System.out.println(str);
	}*/

    }
}


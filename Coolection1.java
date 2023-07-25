import java.util.*;

class Coolection1
{
    public static void main (String arg[])
    {
        ArrayList <Integer> lobj = new LinkedList<Integer>();
        
        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        
        System.out.println("Element are : "+lobj);
        
        Integer iobj = lobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }    
    }
}
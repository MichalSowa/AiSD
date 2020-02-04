public class test
{
    public static void main()
    {


        Jednokierunkowa l = new Jednokierunkowa();
        System.out.println(l);
        l.dodaj(new Integer(1), 0);
        //System.out.println(l.usun(1));
        l.dodaj(new Integer(4));
        l.dodaj(new Integer(5));
        l.dodaj(new Integer(3));
        l.dodaj(new Integer(2), 3);
        l.dodaj(new Integer(6));
        
        System.out.println(l);
        l.ustaw(new Integer(8), 2);
        System.out.println(l);
        System.out.println(l.usun(3));
        //System.out.println(l.zawiera(6));
        //System.out.println(l.zawiera(6));        
        // System.out.println(l.daj(5));

        System.out.println("--------------------");
        System.out.println(l);
        IteratorJednokierunkowa it = new IteratorJednokierunkowa(l);
        System.out.println("");
        for(it.first(); !it.isDone(); it.next())
            System.out.print(it.current() + " "); 
        
        System.out.println("");    
        for(it.last(); !it.isDone(); it.previous())
            System.out.print(it.current() + " ");    
            
        System.out.println("");   
        for(it = l.dajIterator(), it.first(); !it.isDone(); it.next())
            System.out.print(it.current() + " "); 
        

            
        Dwukierunkowa l2 = new Dwukierunkowa();
        System.out.println(l2);
        l2.dodaj(new Integer(1), 0);
        System.out.println(l2);
        l2.dodaj(new Integer(2), 0);
        System.out.println(l2);
        l2.dodaj(new Integer(3), 0);
        System.out.println(l2);
        l2.dodaj(new Integer(4),2);
        System.out.println(l2);
        l2.dodaj(new Integer(5),4);
        System.out.println(l2);     
        l2.ustaw(new Integer(7), 4);
        System.out.println(l2);
        System.out.println(l2.daj(4));        
        System.out.println(l2.usun(1)); 
        System.out.println(l2);
        System.out.println(l2.usun(2)); 
        System.out.println(l2);
        System.out.println(l2.usun(3)); 
        System.out.println(l2);
    }
}

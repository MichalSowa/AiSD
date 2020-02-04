
public class JozefFalwiusz
{
    public static void main(){
        Cykliczna l = new Cykliczna();
        l.dodaj(new Integer(1));
        l.dodaj(new Integer(2));
        l.dodaj(new Integer(3));
        l.dodaj(new Integer(4));
        l.dodaj(new Integer(5));
        l.dodaj(new Integer(6));
        l.dodaj(new Integer(7));
        l.dodaj(new Integer(8));
        l.dodaj(new Integer(9));       
        System.out.println(l);
        
        //wykorzystać IteratorZabojca
            
        System.out.println("Przeżyli: " + l);    
    }
}

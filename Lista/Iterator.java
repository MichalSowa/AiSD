
public interface Iterator  // metody wymagające zaimplementowania
{  public void previous(); 
   public void next();     
   public void first();    
   public void last();  
   // niezaimplementowanie powyższych metod wywołuje wyjątek 
   // UnsupportedOperationException    
   public boolean isDone(); 
   // true jeśli nie jest określony element bieżący,
   // iterator jest w stanie "wyczerpany"
   // false – jeśli jest określony element bieżący
   public Object current(); // throws IteratorOutOfBoundsException;                              
}
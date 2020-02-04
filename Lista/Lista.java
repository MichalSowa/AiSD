public interface Lista
{
    public int rozmiar();
    public void wyczysc();
    public boolean czyPusta();
    
    public void dodaj(Object wartosc);
    public void dodaj(Object wartosc, int indeks) throws IndexOutOfBoundsException;
    public void ustaw(Object wartosc, int indeks) throws IndexOutOfBoundsException;
    public Object daj(int indeks) throws IndexOutOfBoundsException;
    public Object usun(int indeks) throws IndexOutOfBoundsException;
    public boolean zawiera (Object wartosc);
}

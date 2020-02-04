public class IteratorZabojca implements Iterator
{
    private Cykliczna l; 
    private int k, zywi;
    private Cykliczna.Wezel aktualny;
    public IteratorZabojca(Cykliczna l, int k, int zywi)
    {
        this.l = l;
        aktualny = null;
        this.k = k;
        this.zywi = zywi;
    }

    public void previous()
    {
        return;
    }

    public void next()
    {
       aktualny=aktualny.
        //...
    }

    public void first()
    {
        
        //...        
    }

    public void last()
    {
        return; 
    }

    public boolean isDone()
    {
        return l.rozmiar() == zywi;
    }

    public Object current()
    {
        return aktualny.wartosc;
    }
}

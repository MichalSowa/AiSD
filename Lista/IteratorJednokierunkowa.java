public class IteratorJednokierunkowa implements Iterator
{
    private Jednokierunkowa l; 
    private Jednokierunkowa.Wezel aktualny;
    public IteratorJednokierunkowa(Jednokierunkowa l)
    {
        this.l = l;
        aktualny = null;
    }

    public void previous()
    {
        Jednokierunkowa.Wezel tmp=l.dajPoczatek();
        if(aktualny==null || aktualny==l.dajPoczatek()){
            aktualny=null;
        }
        else{
            aktualny=tmp.nast;
            while(tmp!=aktualny){
                tmp=tmp.nast;

            }
        }
        aktualny=tmp;

        //uzupełnić fragment kodu
        //należy przejść po liście od początku 
        //...
    }

    public void next()
    {
        aktualny = aktualny.nast;
    }

    public void first()
    {
        aktualny = l.dajPoczatek();
    }

    public void last()
    {
        aktualny = l.dajKoniec();
    }

    public boolean isDone()
    {
        return aktualny == null;
    }

    public Object current()
    {
        return aktualny.wartosc;
    }
}

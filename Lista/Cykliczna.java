public class Cykliczna implements Lista
{
    public class Wezel{
        public Object wartosc;
        public Wezel nast;
        public Wezel(Object wartosc){
            this.wartosc = wartosc;
            nast = null;
        }
    }
    private int ilosc;
    private Wezel poczatek;
    private Wezel koniec;
    public Cykliczna()
    {
        wyczysc();
    }

    public Wezel dajPoczatek()
    {
        return poczatek;
    }

    public Wezel dajKoniec()
    {
        return koniec;
    }

    public int rozmiar()
    {
        return ilosc;
    }

    public void wyczysc()
    {
        poczatek = koniec = null;
        ilosc = 0;
    }

    public boolean czyPusta()
    {
        return ilosc == 0;
    }

    public void dodaj(Object wartosc)
    {
        Wezel nowy = new Wezel(wartosc);
        if(dajPoczatek()==null || dajKoniec()==null ){
            poczatek=koniec=new Wezel(wartosc);
        }else{
            koniec.nast=nowy;
            koniec=nowy;
            nowy.nast=poczatek;
        }

        
        
        ilosc++;
    }

    public void dodaj(Object wartosc, int indeks) throws IndexOutOfBoundsException
    {
        //indeks 0 oznacza dodanie na poczatku
        //indeks > 0 oznacza dodanie po tym elemencie
        if(indeks < 0) 
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");
        Wezel nowy = new Wezel(wartosc);

        Wezel tmp=poczatek;
        int licznik=0;
        if(indeks == 0 && czyPusta()){
            nowy.nast = poczatek;
            
        }
        else{
            while(indeks<licznik){
                tmp=tmp.nast;
                licznik++;
            }

            tmp=nowy;
        }

        if(indeks == rozmiar()){
            koniec.nast=nowy;
            nowy=koniec;
            koniec.nast=poczatek;

        }

        
        
        
        
        
        //...
        ilosc++; 
    }

    public void ustaw(Object wartosc, int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1) 
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!"); 

        indeks = indeks % ilosc;
        if(indeks == 0)
            indeks = ilosc;

        Wezel tmp = poczatek;

        int licznik=0;
        while(indeks<licznik){
            tmp=tmp.nast;
            licznik++;
        }

        
        
        tmp.wartosc = wartosc;
    }

    public Object daj(int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1) 
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!"); 

        indeks = indeks % ilosc;
        if(indeks == 0)
            indeks = ilosc;
            int krok=1;
        Wezel tmp = poczatek;
        while(krok<indeks){
            tmp=tmp.nast;

        }    
        
        return tmp.wartosc;
    }

    public Object usun(int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1) 
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");

        indeks = indeks % ilosc;
        if(indeks == 0)
            indeks = ilosc;            

        Wezel usuwany = null;
        
        if(indeks == 1)
        {
            usuwany = poczatek;
            poczatek = poczatek.nast;
            if(poczatek == null)
                koniec = poczatek;
        }
        
        
        
         else
        {
            Wezel tmp = poczatek;
            int i = 1;
            while(i+1 < indeks)
            {
                tmp = tmp.nast;
                i++;
            }  
            usuwany = tmp.nast;
            tmp.nast = tmp.nast.nast;  
            if(tmp.nast == null)
                koniec = tmp;
                koniec.nast=poczatek;
            }
        
        
        
        
        
        
        
        
        
        
        
        //...
        ilosc--;
        return usuwany.wartosc;
    }

    public Object usun(Object wartosc) 
    {              
        Wezel usuwany = null;
        
        Wezel tmp = poczatek;
       while(tmp.wartosc==wartosc){
            tmp=tmp.nast;
         
        }
        tmp.wartosc=usuwany.wartosc;
        ilosc--;
        return usuwany.wartosc;
    }    

    public boolean zawiera (Object wartosc)
    {
        Wezel nowy = new Wezel(wartosc);
        Wezel tmp = poczatek;
        int licznik=0;
        while(ilosc>licznik){
            tmp=tmp.nast;
            licznik++;
            if(tmp.wartosc==nowy.wartosc){
                return true;

            }
        }
        return false;
    }

    public String toString()
    {
        String bufor = "";
        //...
        return bufor;
    }
}

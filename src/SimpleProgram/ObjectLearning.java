package SimpleProgram;

public class ObjectLearning {
    final int objectLength; //nie będzie można zmienić tej wartości - działa jak stała
    int objectHeight;
    String objectColor;
    private int objectWeight;

//public - dostępne dla wszystkich
//private - dostępne tylko w danej klasie
//protected
//package private - DOMYŚLNY - dostępny dla pakietu np "src"

    //Konstruktor
    public ObjectLearning(int objectLength, int objectHeight, String objectColor){
        this.objectHeight = objectHeight;
        this.objectLength = objectLength;
        this.objectColor = objectColor;
    }
    public ObjectLearning(int objectLength, int objectHeight){ // Przeciążanie konstruktora. Przy tworzeniu obiektu zmienna Color nie będzie wymagana i przyjmie wartość null
        this.objectLength = objectLength;
        this.objectHeight = objectHeight;
    }


    //Settery i Gettery
    public int getObjectWeight(){    //Getter
        return objectWeight;
    }

    public void setObjectWeight(int objectWeight){ //Setter
        this.objectWeight = objectWeight;
    }


    //Metody
    public String ObjectOn (){
        return ("Włączono"); //zwraca tę wartość w metodzie
    }
    public String ObjectOn(boolean isWorking){ //przeciążanie metody. Dla tej samej metody też można przyjmowac różna argumenty.
        if (isWorking = true)
            return "Włączono i działa";
        else
            return "Włączono i nie działa";
    }

    public void ObjectMove(){ //Metoda void nic nie zwraca (return; przerywa działanie metody void
        ObjectLeft();
        ObjectRight();
    }
    private void ObjectLeft (){ //Metody private są widzane tylko w wnętrza klasy. Ukrywanie to hermetyzaja/enkapsulacja
        System.out.println("Objekt przesunął się w lewo");
    }
    private void ObjectRight (){
        System.out.println("Obiekt przesunął się w prawo");
    }
}

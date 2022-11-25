public class ObjectLearning {
    final int objectLength; //nie będzie można zmienić tej wartości
    int objectHeight;
    String objectColor;

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

    //Metody
    public String ObjectOn (){
        return ("Włączono"); //zwraca tę wartość w metodzie
    }
}

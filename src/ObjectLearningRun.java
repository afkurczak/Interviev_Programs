public class ObjectLearningRun {
    public static void Run(){
       ObjectLearning objectLearning = new ObjectLearning(10, 10, "Blue"); // Stworzony obiekt ze wszystkimi argumentami
        ObjectLearning objectLearning1 = new ObjectLearning(20, 30); //Stworzony obiekt bez argumentu Color
        objectLearning1.objectColor = "Green"; //Dodanie argumentu do obiektu

        System.out.println(objectLearning.ObjectOn()); //Wyświetlam wartość dla medoty ObjectOn
        System.out.println((objectLearning1.ObjectOn(true))); //Wyświetlanie wartości z parametrem

        objectLearning.ObjectMove(); //Uruchomienie metody void

        objectLearning.setObjectWeight(15); //Setter
        objectLearning.getObjectWeight(); //Getter

    }
}

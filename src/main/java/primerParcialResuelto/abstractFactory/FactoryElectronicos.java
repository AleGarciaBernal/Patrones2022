package primerParcialResuelto.abstractFactory;

public class FactoryElectronicos {
     public static Electronicos make(String type){
         Electronicos ele;
         switch (type){
             case"television":
                 ele = new Television();
                 break;
             case"microondas":
                 ele = new Microondas();
                 break;
             case"radio":
                 ele= new Radio();
                 break;
             case"batidora":
                 ele= new Batidora();
                 break;
             case"refrigerador":
                 ele= new Refrigerador();
                 break;
             default:
                 ele= new Television();
                 break;
         }
         return ele;
     }


}

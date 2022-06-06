package ejerciciosP2.chainResponsability;

public class Client {
    public static void main(String []args){

        Persona[] arr;

        arr=new Persona[30];

        arr[0] = new Persona("Diego",5);
        arr[1] = new Persona("Dany",22);
        arr[2] = new Persona("Cami",10);
        arr[3] = new Persona("Rash",15);
        arr[4] = new Persona("Igna",31);

        for(int i=5;i<30;i++){
            arr[i]=new Persona("Juancito",18);
        }

        ManagerHandler managerHandler= new ManagerHandler();
        managerHandler.criteriaHandler(arr);

    }
}

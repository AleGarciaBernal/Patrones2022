package ejerciciosP2.chainResponsability;

public interface IHandler {

    void setNext(IHandler handler);//Setear al  responsable
    void criteriaHandler(Persona[]arr); //cambia segun el problema -----Student[] arr
    IHandler next(); //Retornar a los manejadores

}

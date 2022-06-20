package ejerciciosP3.visitor.ejercicio;

public interface IPais {


     void accept(IVisitor visitor, boolean dolares); //si dolares true--> se cambia a dolares si es false a la moneda del pais
}

package ejerciciosP3.visitor.ejercicio;

public interface IVisitor {

    double visitBoliviaBS(Bolivia bolivia);
    double visitBoliviaUSD(Bolivia bolivia);

    double visitArgentinaPA(Argentina argentina);
    double visitArgentinaUSD(Argentina argentina);

    double visitBrasilR(Brasil brasil);
    double visitBrasilUSD(Brasil brasil);

    double visitItaliaEU(Italia italia);
    double visitItaliaUSD(Italia italia);


}

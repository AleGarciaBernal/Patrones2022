package primerParcialResuelto.builder;

public class Client {

    public static void main (String[]args){

        Director dir=new Director();

        BuilderCombo comboMega=new ComboMega();
        BuilderCombo comboMediano=new ComboMediano();
        BuilderCombo comboNormal=new ComboNormal();

        dir.setBuilderCombo(comboMega);
        dir.buildCombo();
        Combo c1= dir.getCombo();
        c1.showInfo();

        dir.setBuilderCombo(comboMediano);
        dir.buildCombo();
        Combo c2= dir.getCombo();
        c2.showInfo();

        dir.setBuilderCombo(comboNormal);
        dir.buildCombo();
        Combo c3= dir.getCombo();
        c3.showInfo();


    }
}


package ejerciciosP2.memento;

public class Client {
    public static void main(String[] ardssd) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        BaseDeDatos base;

        base= new BaseDeDatos("enero");
        //ENERO
        Persona p1=new Persona("Miriam", "252525", 14);
        Persona p2=new Persona("Jose", "252525", 15);
        base.addPersona(p1);
        base.addPersona(p2);
        originator.setMemento(base);
        caretaker.addMemento("enero",originator.createMemento());


        //FEBRERO
        base=new BaseDeDatos("febrero");
        Persona p3=new Persona("Luis", "696969", 74);
        Persona p4=new Persona("Nancy", "55666", 68);
        base.addPersona(p3);
        base.addPersona(p4);
        originator.setMemento(base);
        caretaker.addMemento(base.getMes(), originator.createMemento());

        //MARZO
        base= new BaseDeDatos("marzo");
        Persona p5=new Persona("Nadia", "55855851", 45);
        Persona p6=new Persona("Khalesi", "111111110", 26);
        base.addPersona(p5);
        base.addPersona(p6);
        originator.setMemento(base);
        caretaker.addMemento(base.getMes(), originator.createMemento());

        //ABRIL
        base= new BaseDeDatos("abril");
        Persona p7=new Persona("Quispe", "12345", 45);
        Persona p8=new Persona("Rene", "107810", 26);
        base.addPersona(p7);
        base.addPersona(p8);
        originator.setMemento(base);
        caretaker.addMemento(base.getMes(), originator.createMemento());

        //MAYO
        base= new BaseDeDatos("mayo");
        Persona p9=new Persona("Pablo", "57751", 45);
        Persona p10=new Persona("kiko", "1136910", 26);
        base.addPersona(p9);
        base.addPersona(p10);
        originator.setMemento(base);
        caretaker.addMemento(base.getMes(), originator.createMemento());

        base= originator.restoreMemento(caretaker.getMemento("abril"));
        base.showInfo();

    }
}

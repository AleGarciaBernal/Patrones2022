package ejerciciosP2.memento;

public class Originator {
    private BaseDeDatos state;

    public void setMemento(BaseDeDatos state){
        System.out.println("Originator> set state "+state.getMes());
        this.state=state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public BaseDeDatos restoreMemento(Memento m){
        this.state= m.getState();
        return this.state;
    }

}

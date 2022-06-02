package ejerciciosP2.mediator;

public abstract class Persona {
    protected ICanalDeComunicacion canalComunication;
    private String ci;
    private String name;
    private String cargo;
    
    public Persona(ICanalDeComunicacion canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}

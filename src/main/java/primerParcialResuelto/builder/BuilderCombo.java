package primerParcialResuelto.builder;

public abstract class BuilderCombo {

    protected Combo combo;

    public Combo getCombo(){
        return combo;
    }

    public void createCombo(){
        this.combo=new Combo();
    }

    public abstract void buildPipocas();
    public abstract void buildCantidadDeVasos();
    public abstract void buildTipoDeVasos();
    public abstract void buildRecargasIlimitadas();
    public abstract void buildNroDeChocolates();

}

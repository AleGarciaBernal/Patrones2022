package primerParcialResuelto.builder;

public class Director {

    private BuilderCombo builderCombo;

    public Combo getCombo(){
        return builderCombo.getCombo();
    }


    public void setBuilderCombo(BuilderCombo builderCombo) {this.builderCombo = builderCombo;}

    public void buildCombo(){
        this.builderCombo.createCombo();
        this.builderCombo.buildPipocas();
        this.builderCombo.buildCantidadDeVasos();
        this.builderCombo.buildTipoDeVasos();
        this.builderCombo.buildRecargasIlimitadas();
        this.builderCombo.buildNroDeChocolates();

    }

}

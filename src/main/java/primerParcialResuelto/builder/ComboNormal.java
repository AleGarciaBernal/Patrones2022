package primerParcialResuelto.builder;

public class ComboNormal extends BuilderCombo {

    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas Normal");
    }

    @Override
    public void buildCantidadDeVasos() {
        this.combo.setCantidadDeVasos(1);
    }

    @Override
    public void buildTipoDeVasos() {
        this.combo.setTipoDeVasos("Normal");
    }

    @Override
    public void buildRecargasIlimitadas() {
        this.combo.setRecargaIlimitadas(false);
    }

    @Override
    public void buildNroDeChocolates() {
        this.combo.setNroChocolates(0);
    }
}

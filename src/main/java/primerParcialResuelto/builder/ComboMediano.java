package primerParcialResuelto.builder;

public class ComboMediano extends BuilderCombo {

    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas Grandes");
    }

    @Override
    public void buildCantidadDeVasos() {
        this.combo.setCantidadDeVasos(2);
    }

    @Override
    public void buildTipoDeVasos() {
        this.combo.setTipoDeVasos("Grandes");
    }

    @Override
    public void buildRecargasIlimitadas() {
        this.combo.setRecargaIlimitadas(false);
    }

    @Override
    public void buildNroDeChocolates() {
        this.combo.setNroChocolates(1);
    }
}

package primerParcialResuelto.builder;

public class ComboMega extends BuilderCombo {

    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas Extra-Grandes");
    }

    @Override
    public void buildCantidadDeVasos() {
        this.combo.setCantidadDeVasos(3);
    }

    @Override
    public void buildTipoDeVasos() {
        this.combo.setTipoDeVasos("Extra-Grandes");
    }

    @Override
    public void buildRecargasIlimitadas() {
        this.combo.setRecargaIlimitadas(true);
    }

    @Override
    public void buildNroDeChocolates() {
        this.combo.setNroChocolates(3);
    }
}

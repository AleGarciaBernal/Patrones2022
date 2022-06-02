package patrones.factoryMethod.ejemplos.helados;

public class CreatorHeladoMixto extends Creator{


    //este es el facotry method
    @Override
    public HeladoMixto createHelado() {
        Fruta cereza=new Fruta();
        cereza.setNombre("Cereza");
        cereza.setTipoFruta("S");

        Base galleta=new Base();
        galleta.setNombre("oreo");
        galleta.setTipoFruta("??");

        Crema crema=new Crema();
        crema.setMarca("PIL");
        crema.setSabor("leche");

        HeladoMixto heladoMixto=new HeladoMixto(cereza,galleta,crema);
        heladoMixto.setCosto("55");
        heladoMixto.setForma("redondo");
        heladoMixto.setSize("XL");

        return heladoMixto;

    }
}

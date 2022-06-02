package ejerciciosP1.pasajesAbstract;

public class FactoryPasaje {
    public static Pasaje make(String type){
        Pasaje pasaje;
        switch (type){
            case"standar":
                pasaje = new Standar();
                break;
            case"solidario":
                pasaje= new Solidario();
                break;
            case"infantes":
                pasaje= new Infantes();
                break;
            default:
                pasaje= new Standar();
                break;
        }
        return pasaje;
    }
}

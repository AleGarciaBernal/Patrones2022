package ejerciciosP2.iterator;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[]args){

        Map<Integer, Automovil> map = new HashMap<Integer, Automovil>();
        int pos=0;

        Automovil a1=new Automovil(125000,"Celerio",4,"2x4");
        Automovil a2=new Automovil(6000,"Vitara",4,"4x4");
        Automovil a3=new Automovil(30000,"Montero",6,"4x4");
        Automovil a4=new Automovil(5000,"Xpander",5,"4x4");
        Automovil a5=new Automovil(666666,"Golf",4,"2x4");
        Automovil a6=new Automovil(125000,"Bora",4,"2x4");
        Automovil a7=new Automovil(6999999,"Patrol",6,"4x4");
        Automovil a8=new Automovil(4200000,"Murano",7,"4x4");

        ImportadoraAggregate1 imcruz = new ImportadoraAggregate1();
        imcruz.add(a1);
        imcruz.add(a2);

        ImportadoraAggregate2 autostar = new ImportadoraAggregate2();
        autostar.aregarDatos(a3);
        autostar.aregarDatos(a4);

        ImportadoraAggregate3 hansa = new ImportadoraAggregate3();
        hansa.aregarDatos(a5);
        hansa.aregarDatos(a6);

        ImportadoraAggregate3 nissan = new ImportadoraAggregate3();
        nissan.aregarDatos(a7);
        nissan.aregarDatos(a8);

        Iterator iterator;
        iterator = imcruz.createIterator();
        while (iterator.hasNext()){
            Automovil aut = (Automovil) iterator.next();
            map.put(pos,aut);
            pos++;
            System.out.println("IMCRUZ: "+aut);
        }

        iterator = autostar.createIterator();
        while (iterator.hasNext()){
            Automovil aut = (Automovil) iterator.next();
            map.put(pos,aut);
            pos++;
            System.out.println("AUTOSTAR: "+aut);
        }

        iterator = hansa.createIterator();
        while (iterator.hasNext()){
            Automovil aut = (Automovil) iterator.next();
            map.put(pos,aut);
            pos++;
            System.out.println("HANSA: "+aut);
        }

        iterator = nissan.createIterator();
        while (iterator.hasNext()){
            Automovil aut = (Automovil) iterator.next();
            map.put(pos,aut);
            pos++;
            System.out.println("NISSAN: "+aut);
        }


        System.out.println("MAPA DE AUTOS DE LA ADUANA");
        System.out.println("Nro de Auto agregador al mapa "+ map.size());

        for(int i=0; i<map.size();i++){
            System.out.println(map.get(i));
        }

    }

    }


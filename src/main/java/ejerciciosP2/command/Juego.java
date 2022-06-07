package ejerciciosP2.command;

public class Juego {

    private String name;
    private int year;

    public Juego(){
        name="Cuphead";
        year=2017;
    }

    public void disparar(){
        System.out.println("Piu Piu Piu");
    }
    public void modoDefensa(){
        System.out.println("Cubriendome en una roca");
    }
    public void atacar(){
        System.out.println("Al Ataque!!!!");
    }

    public String getName() {
        return name;
    }

    public Juego setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Juego setYear(int year) {
        this.year = year;
        return this;
    }
}

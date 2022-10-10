package p1;
import java.util.*;
public class State {
    private ArrayList<ArrayList<int>> assignacions;
    private int[] capacitatrestant;
    private double benefici;
    //ArrayList<Central> Centrales; ?
    //ArrayList<Cliente> Clientes; ?


    // Constructor
    public State(int numerocentrals, int[] costcentrals) {
        assignacions = new ArrayList<>(numerocentrals);
        for(int  i = 0; i < numerocentrals; ++i){
            assignacions.add(new ArrayList());
        }
        capacitatrestant = new int[numerocentrals];
        capacitatrestant = costcentrals; //Al principi tots els costos restants son 0.
        benefici = 0;
    }

    public void swapConsumers(Cliente cl1, Cliente cl2, Central cen1, Central cen2, int nomcl1, int nomcl2, int nomcen1, int nomcen2) {

    }

    public void moveConsumer(int central, int consumer, Central cent, Cliente cl) {


    }

    public double heurisitic() {
        return 0;
    }

    public double value() {
        return 0;
    }

}
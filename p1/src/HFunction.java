package p1;

import aima.search.framework.HeuristicFunction;

public class HFunction implements HeuristicFunction {
    public int getHeuristicValue(Object n){

        return ((State) n).heuristic();
    }
}

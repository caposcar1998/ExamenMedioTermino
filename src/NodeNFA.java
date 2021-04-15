import java.util.*;

public class NodeNFA {
    private ArrayList<Integer> states;
    private ArrayList <Paths> paths;
    private int finalState;
    //NFA como un nodo

    public NodeNFA(){
        this.states = new ArrayList <> ();
        this.paths = new ArrayList <> ();
        this.finalState = 0;
    }

    public NodeNFA(int size){
        this.states = new ArrayList <> ();
        this.paths = new ArrayList <> ();
        this.finalState = 0;
        this.setStateSize(size);
    }

    public NodeNFA(char c){
        this.states = new ArrayList<> ();
        this.paths = new ArrayList<> ();
        this.setStateSize(2);
        this.finalState = 1;
        this.paths.add(new Paths(0, 1, c));
    }

    public void adjustInitialState(){
        states.remove(0);
    }

    public ArrayList<Integer> getStates(){
        return states;
    }

    public ArrayList<Paths> getPaths(){
        return paths;
    }

    public Integer getFinalState(){
        return finalState;
    }

    public void setFinalState(int a, int b){
        finalState = a + b;
    }

    public void setState(int a){
        states.add(a);
    }

    public void addPath(int initialState, int nextState, Character c){
        paths.add(new Paths(initialState, nextState, c));
    }

    public void setStateSize(int size){
        for (int i = 0; i < size; i++)
            this.states.add(i);
    }

    public void display(){
        for (Paths p: paths){
            System.out.println("("+ p.initialState +", "+ p.transitionWith +
                    ", "+ p.nextState +")");
        }
    }

    public static class Paths{
        private int initialState;
        private int nextState;
        private Character transitionWith;

        public Paths(int i, int j, Character c){
            this.initialState = i;
            this.nextState = j;
            this.transitionWith = c;
        }

        public Integer getInitialState(){
            return initialState;
        }

        public Integer getNextState(){
            return nextState;
        }

        public Character getTransitionWith(){
            return transitionWith;
        }
    }

}

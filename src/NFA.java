import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
//Clase que contiene todos los resultados a imprimir. Es el NFA completo
public class NFA extends TablaTransicion{
    private Set<Integer> states;
    private Set<Character> characters;
    private Map<Integer, Map<Character, List<Integer> >> transitions;
    private List<Integer> listStates;
    private int s;

    public NFA(){
        this.states = new HashSet<>();
        this.characters = new HashSet<>();
        this.transitions = new HashMap<>();
        this.listStates = new ArrayList<>();
        this.s = 0;
    }

    @Override
    public Set<Integer> addToTable(int state, char c) {
        characters.add(c);
        states.add(state);
        return states;
    }

    public void adjustState(){
        states.add(states.size() + 1);
    }

    @Override
    public int getStates() {
        return s;
    }

    public void setStates(int totalStates){
        s = totalStates;
    }

    @Override
    public Set<Character> getAlphabet() {
        return characters;
    }

    @Override
    public  Map<Integer, Map<Character, List<Integer> >> getTransitions() {
        return transitions;
    }

    @Override
    public List<Integer> getTransitionInRow(int key, Character header){
        return transitions.get(key).get(header);
    }

    public void addToTransitionMap(int key, Character header, int state){
        Map<Character, List<Integer>> temp = new HashMap<Character, List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        if(transitions.containsKey(key)){
            if(transitions.get(key).containsKey(header)){ transitions.get(key).get(header).add(state); }
            else{
                if (state != 99){  tempList.add(state); }
                transitions.get(key).put(header, tempList);
            }
        }else{
            if (state != 99){ tempList.add(state); }
            temp.put(header, tempList);
            transitions.put(key, temp);
        }
    }
}
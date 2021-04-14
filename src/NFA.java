import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
//Clase que contiene todos los resultados a imprimir. Es el NFA completo
public class NFA extends TablaTransicion{
    private Set<Integer> states;
    private Set<Character> characters;
    private Map<Integer, Map<Character, List<Integer> >> transitions;
    private List<Integer> listStates;

    public NFA(){
        this.states = new HashSet<>();
        this.characters = new HashSet<>();
        this.transitions = new HashMap<>();
        this.listStates = new ArrayList<>();
    }

    @Override
    public Set<Integer> addToTable(int state, char c) {
        characters.add(c);
        states.add(state);
        return states;
    }

    @Override
    public int getStates() {
        return states.size();
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
        //{0: {'a': [1]}}

        Map<Character, List<Integer>> temp = new HashMap<Character, List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        if(transitions.containsKey(key)){

            if(transitions.get(key).containsKey(header)){

                transitions.get(key).get(header).add(state);
                System.out.println("New entry: " + transitions);

            }else{

                if (state != 99){
                    tempList.add(state);
                }

                transitions.get(key).put(header, tempList);

                System.out.println("New entry: " + transitions);
            }
        }else{

            if (state != 99){
                tempList.add(state);
            }
            temp.put(header, tempList);
            transitions.put(key, temp);
            System.out.println("New entry: " + transitions);
        }



        /*
        {0={a=[1]}}
        {0={ñ=[99]}, 1={a=[99]}}
        {0={ñ=[99]}, 1={ñ=[99]}, 2={a=[99]}}
        */
    }


}
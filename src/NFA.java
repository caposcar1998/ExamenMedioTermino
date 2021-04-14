import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{
    Set<Integer> states = new HashSet<>();
    Set<Character> characters = new HashSet<>();
    Map<Integer, Map<Character, List<Integer> >> transitions = new HashMap<>();
    List<Integer> listStates = new ArrayList<>();

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
        System.out.println("Voy a insertar en key: " + key + " con header: " + header + " con state: " + state);
        Map<Character, List<Integer>> temp = new HashMap<Character, List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        if(transitions.containsKey(key)){
            System.out.println("Transition contiene key: " + key);
            if(transitions.get(key).containsKey(header)){
                System.out.println("Transition." +  key + " contiene header: " + header);
                transitions.get(key).get(header).add(state);
                System.out.println("New entry: " + transitions);

            }else{
                System.out.println("Transition." +  key + " NO contiene header: " + header);
                if (state != 99){
                    tempList.add(state);
                }

                transitions.get(key).put(header, tempList);

                System.out.println("New entry: " + transitions);
            }
        }else{
            System.out.println("Transition NO contiene key: " + key + " State: " + state);
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
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{


    @Override
    public Set<Integer> get(int state, char c) {
        Set<Integer> hash = new HashSet<>();
        hash.add(state);
        return hash;
    }

    @Override
    public int getStates() {
        return 3;
    }

    @Override
    public Set<Character> getAlphabet() {
        Set<Character> hash = new HashSet<>();
        hash.add('a');
        hash.add('b');
        return hash;
    }
}
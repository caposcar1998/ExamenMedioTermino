import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{


    @Override
    public Set<Integer> get(int state, char c) {
        return null;
    }

    @Override
    public int getStates() {
        return 0;
    }

    @Override
    public Set<Character> getAlphabet() {
        return null;
    }
}
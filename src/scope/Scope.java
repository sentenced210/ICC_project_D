package scope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import types.IntegerValue;
import types.Value;

public class Scope {
    public class Variable {
        private Value value;
        private String name;

        private Variable(){}

        public Variable(String name, Value value) {
            this.value = value;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return ((Variable) obj).name.equals(this.name);
        }
    }

    private HashMap<String, Stack<Variable>> globalVariables;
    private Stack<HashSet<String>> localVariables;

    public Scope() {
        globalVariables = new HashMap<>();
        localVariables = new Stack<>();
    }

    public void newScope() {
        for (String v : localVariables.peek()) {

        }

        if (globalVariables.empty()) {
            globalVariables.add(new HashSet<>());
            localVariables.add(new HashSet<>());
        } else {
            HashSet<Variable> tmp = new HashSet<>();
            tmp.addAll(globalVariables.peek());
            tmp.addAll(localVariables.peek());
            globalVariables.add(tmp);
            localVariables.add(new HashSet<>());
        }
    }

    public void endOfScope() {
        globalVariables.pop();
        localVariables.pop();
    }

    public void newVariable(String name, Value value) {
        localVariables.peek().add(new Variable(name, value));
    }

    public boolean exists(String name) {
        return globalVariables.peek().contains(new Variable(name, new IntegerValue(1))) || localVariables.peek().contains(new Variable(name, new IntegerValue(1)));
    }

    public boolean isDeclared(String name) {
        return localVariables.peek().contains(name);
    }

    public void setValue(String name, Value value) {

    }
}

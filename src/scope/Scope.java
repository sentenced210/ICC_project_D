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

    private HashMap<String, Stack<Value>> globalVariables;
    private Stack<HashSet<String>> localVariables;

    public Scope() {
        globalVariables = new HashMap<>();
        localVariables = new Stack<>();
    }

    public void newScope() {
        localVariables.push(new HashSet<>());
    }

    public void endOfScope() {
        for (String varName : localVariables.peek()) {
            globalVariables.get(varName).pop();
            if (globalVariables.get(varName).empty()) {
                globalVariables.remove(varName);
            }
        }
        localVariables.pop();
    }

    public void newVariable(String name, Value value) {
        if (!globalVariables.containsKey(name)) {
            globalVariables.put(name, new Stack<>());
        }
        globalVariables.get(name).push(value);
        localVariables.peek().add(name);
    }

    public boolean exists(String name) {
        return globalVariables.containsKey(name);
    }

    public boolean isDeclared(String name) {
        return localVariables.peek().contains(name);
    }

    public void setValue(String name, Value value) {
        globalVariables.get(name).pop();
        globalVariables.get(name).push(value);
    }
}

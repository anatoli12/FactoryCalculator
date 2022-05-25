package commands;

import operations.Add;
import operations.Divide;
import operations.Multiply;
import operations.Substract;

public class CommandFactory {
    public Command doCommand(String command){
        if(command==null||command.isEmpty()){
            return null;
        }
        switch(command){
            case "addition":
                return new Add();
            case "division":
                return new Divide();
            case "multiplication":
                return new Multiply();
            case "substraction":
                return new Substract();
            default:
                throw new IllegalArgumentException("Unknown command "+command);
        }
    }
}

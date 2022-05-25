package operations;

import commands.Command;

public class Divide implements Command {
    @Override
    public double execute(double x, double y) {
        return x/y;
    }
}

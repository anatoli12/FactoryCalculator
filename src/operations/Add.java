package operations;

import commands.Command;

public class Add implements Command {
    @Override
    public double execute(double x, double y) {
        return x+y;
    }
}

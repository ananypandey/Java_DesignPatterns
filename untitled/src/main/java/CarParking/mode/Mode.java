package CarParking.mode;

import CarParking.Commands.CommandExecutor;
import CarParking.Commands.CommandExecutorFactory;
import CarParking.Exception.InvalidCommandException;
import CarParking.OutputPrinter;
import CarParking.model.Command;

import java.io.IOException;

public abstract class Mode
{
    private CommandExecutorFactory commandExecutorFactory;
    protected OutputPrinter outputPrinter;
    public Mode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter)
    {
        this.commandExecutorFactory = commandExecutorFactory;
        this.outputPrinter=outputPrinter;
    }

    protected void processCommand(final Command command)
    {
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);
        if (commandExecutor.validate(command)) {
            commandExecutor.execute(command);
        } else {
            throw new InvalidCommandException();
        }
    }

    public abstract void process() throws IOException;
}

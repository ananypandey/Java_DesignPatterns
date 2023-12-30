package CarParking.Commands;

import CarParking.Exception.InvalidCommandException;
import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory
{
    private Map<String,CommandExecutor> commands = new HashMap<>();
    public CommandExecutorFactory(final ParkingLotService parkingLotService)
    {
        final OutputPrinter outputPrinter = new OutputPrinter();
        commands.put(CreateParkingLotCommandExecutor.COMMAND_NAME,
                new CreateParkingLotCommandExecutor(parkingLotService,outputPrinter));

        commands.put(ParkingCommandExecutor.COMMAND_NAME,
                new ParkingCommandExecutor(parkingLotService,outputPrinter));

        commands.put(LeaveCommandExecutor.COMMAND_NAME,
                new LeaveCommandExecutor(parkingLotService,outputPrinter));

        commands.put(StatusCommandExecutor.COMMAND_NAME,
                new StatusCommandExecutor(parkingLotService,outputPrinter));

        commands.put(ColorToRegNumberCommandExecutor.COMMAND_NAME,
                new ColorToRegNumberCommandExecutor(parkingLotService,outputPrinter));

        commands.put(ColorToSlotNumberCommandExecutor.COMMAND_NAME,
                new ColorToSlotNumberCommandExecutor(parkingLotService,outputPrinter));

        commands.put(SlotForRegNumCommandExecutor.COMMAND_NAME,
                new SlotForRegNumCommandExecutor(parkingLotService,outputPrinter));

        commands.put(ExitCommandExecutor.COMMAND_NAME,
                new ExitCommandExecutor(parkingLotService,outputPrinter));

    }
    public CommandExecutor getCommandExecutor(final Command command)
    {
        final CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if(commandExecutor==null)
        {
            throw new InvalidCommandException();
        }
        return commandExecutor;
    }
}






















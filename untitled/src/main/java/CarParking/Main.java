package CarParking;

import CarParking.Commands.CommandExecutorFactory;
import CarParking.Exception.InvalidModeException;
import CarParking.Service.ParkingLotService;
import CarParking.mode.FileMode;
import CarParking.mode.InteractiveMode;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        final OutputPrinter outputPrinter = new OutputPrinter();
        final ParkingLotService parkingLotService = new ParkingLotService();
        final CommandExecutorFactory commandExecutorFactory =
                new CommandExecutorFactory(parkingLotService);

        if (isInteractiveMode(args)) {
            new InteractiveMode(commandExecutorFactory, outputPrinter).process();
        } else if (isFileInputMode(args)) {
            new FileMode(commandExecutorFactory, outputPrinter, args[0]).process();
        } else {
            throw new InvalidModeException();
        }
    }
    private static boolean isFileInputMode(final String[] args)
    {
        return args.length==1;
    }
    private static boolean isInteractiveMode(final String[] args)
    {
        return args.length==0;
    }
}

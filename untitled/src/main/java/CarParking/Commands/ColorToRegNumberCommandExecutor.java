package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;
import CarParking.model.Slot;

import java.util.List;
import java.util.stream.Collectors;

public class ColorToRegNumberCommandExecutor extends CommandExecutor{
    public static final String COMMAND_NAME ="registration_numbers_for_cars_with_colour";

    public ColorToRegNumberCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter)
    {
        super(parkingLotService,outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size()==1;
    }

    @Override
    public void execute(Command command) {
        final List<Slot> slotsForColor = parkingLotService.getSlotsForColor(command.getParams().get(0));
        if(slotsForColor.isEmpty())
        {
            outputPrinter.notFound();
        }
        else
        {
            final String result =
                    slotsForColor.stream()
                            .map(slot -> slot.getParkedCar().getRegistrationNumber())
                            .collect(Collectors.joining(", "));
            outputPrinter.printWithNewLine(result);
        }
    }
}

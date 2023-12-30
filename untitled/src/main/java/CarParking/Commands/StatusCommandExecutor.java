package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Car;
import CarParking.model.Command;
import CarParking.model.Slot;

import java.util.List;

public class StatusCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME ="";

    public StatusCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter)
    {
        super(parkingLotService,outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().isEmpty();
    }

    @Override
    public void execute(Command command)
    {
        final List<Slot> occupiedSlots = parkingLotService.getOccupiedSlots();
        if(occupiedSlots.isEmpty())
        {
            outputPrinter.parkingLotEmpty();
            return;
        }
        outputPrinter.statusHeader();
        for (Slot slot : occupiedSlots) {
            final Car parkedCar = slot.getParkedCar();
            final String slotNumber = slot.getSlotNumber().toString();

            outputPrinter.printWithNewLine(padString(slotNumber, 12)
                    + padString(parkedCar.getRegistrationNumber(), 19) + parkedCar.getColor());
    }

}

    private static String padString(final String word, final int length)
    {
        String newWord = word;
        for(int count = word.length(); count < length; count++) {
            newWord = newWord + " ";
        }
        return newWord;
    }
}

package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;
import CarParking.model.Slot;

import java.util.List;
import java.util.Optional;

public class SlotForRegNumCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME ="slot_number_for_registration_number";
    public SlotForRegNumCommandExecutor(final ParkingLotService parkingLotService,final OutputPrinter outputPrinter) {
        super(parkingLotService,outputPrinter);
    }

    @Override
    public boolean validate(final Command command) {
        return command.getParams().size()==1;
    }

    @Override
    public void execute(Command command) {
    final List<Slot> occupiedSlots = parkingLotService.getOccupiedSlots();
    final String regNumberToFind = command.getParams().get(0);
    final Optional<Slot> foundSlot = occupiedSlots.stream().filter(slot -> slot.getParkedCar().getRegistrationNumber().equals(regNumberToFind)).findFirst();
    if (foundSlot.isPresent())
    {
        outputPrinter.printWithNewLine(foundSlot.get().getSlotNumber().toString());
    }
    else
    {
        outputPrinter.notFound();
    }
    }
}

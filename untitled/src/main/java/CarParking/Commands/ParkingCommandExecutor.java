package CarParking.Commands;

import CarParking.Exception.NoFreeSlotAvailableException;
import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Car;
import CarParking.model.Command;

public class ParkingCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "park";

    public ParkingCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService,outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size()==2;
    }

    @Override
    public void execute(Command command) {
        final Car car = new Car(command.getParams().get(0),command.getParams().get(1));
        try{
            final Integer slot = parkingLotService.park(car);
            outputPrinter.printWithNewLine("Allocated Slot Number : "+slot);
        }
        catch (NoFreeSlotAvailableException exception)
        {
            outputPrinter.parkingLotFull();
        }
    }
}

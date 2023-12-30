package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;

public abstract class CommandExecutor
{
    protected ParkingLotService parkingLotService;
    protected OutputPrinter outputPrinter;

    public CommandExecutor(final ParkingLotService parkingLotService,final OutputPrinter outputPrinter)
    {
        this.parkingLotService=parkingLotService;
        this.outputPrinter=outputPrinter;
    }
    public abstract boolean validate(Command command);
    public abstract void execute(Command command);

}

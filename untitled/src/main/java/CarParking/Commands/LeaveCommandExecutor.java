package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;

import java.util.List;

public class LeaveCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME ="leave";

    public LeaveCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService,outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        final List<String> params = command.getParams();
        if(params.size()!=1)
        {
            return false;
        }
        return true;
    }

    @Override
    public void execute(Command command) {
        final int slotNum = Integer.parseInt(command.getParams().get(0));
        parkingLotService.makeSlotFree(slotNum);
        outputPrinter.printWithNewLine("Slot Number"+slotNum+" is free");
    }
}

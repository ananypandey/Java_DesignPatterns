package CarParking.Commands;

import CarParking.OutputPrinter;
import CarParking.Service.ParkingLotService;
import CarParking.model.Command;
import CarParking.model.ParkingLot;
import CarParking.model.parking.strategy.NaturalOrderingParkingStrategy;

import java.util.List;

public class CreateParkingLotCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME ="create_parking_lot" ;

    public CreateParkingLotCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter)
    {
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
        final int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
        final ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
    parkingLotService.createParkingLot(parkingLot, new NaturalOrderingParkingStrategy());
    outputPrinter.printWithNewLine("Created a parking lot with : "+parkingLot.getCapacity()+" slots");
    }
}

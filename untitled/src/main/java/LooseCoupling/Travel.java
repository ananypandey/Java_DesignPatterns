package LooseCoupling;

public class Travel implements ITravel{

    private Transport transport;
    Travel(Transport transport)
    {
       this.transport=transport;
    }
    @Override
    public void start() {
        transport.start();
    }
}

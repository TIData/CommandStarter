package domein;

public class GarageDoorOpenCommand implements Command{
    
    private GarageDoor door;
    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
    }

    @Override
    public void undo() {
        door.down();
        door.lightOff();
    }
    
    

}
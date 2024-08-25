package design.pattern.command;

public class RemoteControl {



    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];



    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPressed() {
        if(undoCommand!=null){
        undoCommand.undo();}

    }




}
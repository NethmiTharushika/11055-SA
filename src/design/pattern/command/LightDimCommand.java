package design.pattern.command;

public class LightDimCommand implements Command{
    Light light;
    int  level ;
    int previousBrightness;
    public LightDimCommand( Light light, int newBrightness ){
        this.light = light;
        this.level = newBrightness;
    }
    @Override
    public void execute(){
        previousBrightness =light.getLevel();
        light.dim(level);}

    public void undo() {
        light.dim(previousBrightness);
    }
}
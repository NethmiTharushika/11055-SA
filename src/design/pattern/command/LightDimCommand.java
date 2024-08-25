package design.pattern.command;

public class LightDimCommand implements Command{
    Light light;
    int newBrightness ;
    int previousBrightness;
    public LightDimCommand( Light light, int level){
        this.light = light;
        this.newBrightness = level;
    }
    @Override
    public void execute(){
        previousBrightness =light.getLevel();
        light.dim(newBrightness);}

    public void undo() {
        light.dim(previousBrightness);
    }
}
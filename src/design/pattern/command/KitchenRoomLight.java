package design.pattern.command;

public class KitchenRoomLight implements Light{
    private String location="Kitchen Room";
    int level;
    public void on(){
        level=100;
        System.out.println(location + "light is ON at full brightness");}
    public void off(){
        System.out.println(location + "light is OFF");}
    public void dim(int level){
        System.out.println(location + "light is dimmed to" + level + "%");}
    @Override
    public int getLevel(){
      return level;
    }
}
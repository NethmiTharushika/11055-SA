package design.pattern.abstractFactory;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=6;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
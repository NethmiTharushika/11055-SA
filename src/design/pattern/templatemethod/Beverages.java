package design.pattern.templatemethod;

public abstract class Beverages {
    boolean wantsExtras;

    final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras){
            addExtras();
        }

    }

    abstract void addExtras();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water.");
    }

    void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    abstract void brew();

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
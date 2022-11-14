public abstract class Animal {

    private String name;

    public String getName(){
        return name;
    }

    abstract void makeSound();


    public abstract boolean eat (String foodType);

}

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Miav ");
    }

    public boolean eat(String banana){
        return true;
    }
}

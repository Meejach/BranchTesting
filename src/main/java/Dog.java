public class Dog extends Animal {


    @Override
    void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    void showMood(boolean værdi) {
        if (værdi == true)
            System.out.println("logrer");
        else
            System.out.println("knurrer");
    }
}

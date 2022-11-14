public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Miav");
    }

    @Override
    void showMood(boolean værdi) {
        if (værdi == true)
            System.out.println("spinder");
        else
            System.out.println("væser");
    }
}

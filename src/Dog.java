public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("A puppy is born!");
    }

    public String bark() {
        return "Woof!";
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }
}

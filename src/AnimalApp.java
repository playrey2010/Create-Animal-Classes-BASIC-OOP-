public class AnimalApp {
    public static void main(String[] args) {
//        testing some polymorphic situations and overrides
//        Animal a = new Bird();
//        System.out.println(a.sleep());
//        Animal b;
//        b = a;
//        System.out.println(b.sleep());
//        System.out.println(b.eat());
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog g = new Dog();
        print(g.eat());
        print(g.sleep());
        print(g.bark());

        HomoSapiens hs = new HomoSapiens();
        print(hs.eat());
        print(hs.sleep());
        print(hs.think());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}

public class HomoSapiens extends Animal {
    public HomoSapiens() {
//        super();
        System.out.println("A human is born. ");
    }

    public String think() {
        return "Homo cogitat... (A human being thinks)...";
    }

    @Override
    public String sleep() {
        return "Zzz...";
    }

    @Override
    public String eat() {
        return "NomNomNom";
    }
}

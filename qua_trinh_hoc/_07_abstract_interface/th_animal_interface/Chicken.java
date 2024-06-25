package _07_abstract_interface.th_animal_interface;

public class Chicken extends Animal implements IEdible{
    @Override
    public String makeShound() {
        return "o o";
    }

    @Override
    public String howToEat() {
        return "toi an cam";
    }
}

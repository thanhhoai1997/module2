package _07_abstract_interface.th_animal_interface;

public class Test {
    public static void main(String[] args) {
        Animal[] animals =new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Animal animal1 = new Chicken();

        for (Animal animal: animals){
            System.out.println(animal.makeShound());
            if (animal instanceof Chicken){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());

            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}

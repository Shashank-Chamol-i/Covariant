class Animal
{
    Animal sound()
    {
        System.out.println("NO SOUND : ");
        return new Animal();
    }
}
class Dog extends Animal
{
    Dog sound()
    {
        System.out.println("BARKS : ");
        return new Dog();
    }
}
class Cat extends Animal
{
    Cat sound()
    {
        System.out.println("MEOW : ");
        return new Cat();
    }
}
public class Program01 {
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.sound();
        d.sound();
        c.sound();

        Animal []animal = {new Dog(),new Cat()};
        for(Animal aa : animal)
        {
            aa.sound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мясо", "Поле", "Чихуахуа");
        Cat cat = new Cat("Вискас", "Дом","Алексей");
        Horse horse = new Horse("Трава", "Деревня",100);
        Veterinar veterinar = new Veterinar("Иван", 22);
        dog.Eat();
        cat.Sleep();
        horse.makeNoise();
        veterinar.treatAnimal(dog);
    }
}
class Animal {
    String Food;
    String Location;
    Animal(String Food, String Location){
        this.Food = Food;
        this.Location = Location;
    }
    public void makeNoise(){
        System.out.println("Такое то животное издает такие то звуки");
    }
    public void Eat(){
        System.out.println("Такое то животное ест");
    }
    public void Sleep(){
        System.out.println("Такое то животное спит");
    }
}
class Dog extends Animal {
    String Poroda;
    Dog(String Food, String Location, String Poroda) {
        super(Food, Location);
        this.Poroda = Poroda;
    }

    @Override
    public void Eat() {
        System.out.println("Дог кушает " + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Дог гавкает");
    }

    @Override
    public void Sleep() {
        System.out.println("Дог спит");
    }
}
class Cat extends Animal{
    String NameOfOwner;
    Cat(String Food, String Location, String NameOfOwner) {
        super(Food, Location);
        this.NameOfOwner = NameOfOwner;
    }
    @Override
    public void Eat() {
        System.out.println("Кот кушает " + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void Sleep() {
        System.out.println("Кот спит");
    }
}
class Horse extends Animal {
    int Speed;
    Horse(String Food, String Location, int Speed) {
        super(Food, Location);
        this.Speed = Speed;
    }
    @Override
    public void Eat() {
        System.out.println("Лошадь кушает " + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь фырчит");
    }

    @Override
    public void Sleep() {
        System.out.println("Лошадь спит");
    }
}
class Veterinar {
    String Name;
    int Age;
    Veterinar(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    void treatAnimal(Animal animal){
        System.out.println( "Животное пришло на прием." + " Она ест: " + animal.Food + " Она обитает в: " + animal.Location);
    }
}
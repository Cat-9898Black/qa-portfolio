// 1. Абстрактный класс (Шаблон)
abstract class Animal {
    // Абстрактный метод, - только название без {}
    public abstract void draw();
}

// 2. Кот - наследник Animal
class Cat extends Animal {
    @Override
    public void draw() {
        System.out.println("  /\\_/\\  ");
        System.out.println(" ( o.o ) ");
        System.out.println("  > ^ <  ");
    }
}

// 3. Собака - наследник Animal
class Dog extends Animal {
    @Override
    public void draw() {
        System.out.println("  __      _");
        System.out.println("o'')}____//");
        System.out.println(" `_/      )");
        System.out.println(" (_(_/-(_/ ");
    }
}

// 4. Главный класс для проверки
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(); // Создаём кота
        Animal dog = new Dog(); // Создаём собаку

        cat.draw(); // Нарисует кота
        dog.draw(); // Нарисует собаку
    }
}
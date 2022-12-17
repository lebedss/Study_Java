package Seminars.Seminar_6;

import java.util.Date;
import java.util.UUID;

public class Cat {
    private UUID uuid = UUID.randomUUID();
    private String name;
    private int age;
    private int weight;
    private String model;

    public Cat(int age, int weight, String model) {
        this.age = age;
        this.weight = weight;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            } else {
                Cat cat = (Cat) obj;
                return this.uuid == cat.uuid;
            }
        }
    }

    @Override
    public int hashCode() {
        return 31 * model.hashCode() - age;
    }
}
/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
Можно записать в текстовом виде, не обязательно реализовывать в java

имя, возраст, порода, цвет, здоровье (состояние), вес, дата выставки, история болезни, id, место которое заняла кошка


 */
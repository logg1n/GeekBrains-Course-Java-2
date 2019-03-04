package Sportsman.Animal;

import Sportsman.Sportsman;

public abstract class Animal extends Sportsman {
    private String nameAnimal;


    public Animal(String nameAnimal, int distRun, int distJump, int distSwim) {
        super(distRun, distJump, distSwim);
        this.nameAnimal = nameAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }
}

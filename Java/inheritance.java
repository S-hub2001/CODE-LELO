class Animal {
    int legs = 4;

}

class Dog extends Animal {
    Dog() {
        System.out.println("dog eat meat");
    }

}

class baby_dog extends Dog {
    baby_dog() {
        System.out.println("baby dog eat milk");
    }

}

class cat extends Animal {
    cat() {
        System.out.println("cat eat fish");
    }

}

class inheritance {
    public static void main(String[] args) {
        // Dog bc = new Dog();
        baby_dog sc = new baby_dog();
        cat tc = new cat();

        System.out.println("baby dog have " + sc.legs + "legs");
        System.out.printf("baby dog have %d legs", sc.legs);

    }

}
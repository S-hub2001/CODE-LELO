class monkey {

    public void jump() {

    }

    public void bite() {

    }

}

interface basicAnimal {

    void eat();

    void sleep();
}

class human extends monkey implements basicAnimal {

    public void eat() {

    }

    public void sleep() {

    }

}

public class new12 {
    public static void main(String[] args) {
         
        monkey obj=new human();
        
    }
}

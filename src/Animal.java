class Animal {
    // Put your instance variables here
    String name;
    String favoriteFood;

    static int population;


    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void eat(String food){
        System.out.println(name + " eats " + food + " ");
        if (food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food + " ");
        }else{
            sleep();
        }
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours ");
    }



}

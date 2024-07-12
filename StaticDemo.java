class StaticDemo {

    static int counter;
    int c;

    StaticDemo() {
        counter++;
        System.out.println("Counter's value is: " + counter); // if we make counter a non-static 
        // variable then it'll make a single copy otherwise a dedicated copy of every instance(object)
          
    }

    // static void trial() {
    //     c = 0; can't access c here because it's a non-static instance variable
    // }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();
        System.out.println(StaticDemo.counter); // with the help of class name we can access only static
        // methods or variables not a non-static method or variable
    }
}
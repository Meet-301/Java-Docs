package SuperTrial;

class Parent extends GrandParent {
    Parent() {
        System.out.println("Hii!!");
    }

    @Override
    void grandParent() {
        System.out.println("My grand parent");
    }

    void trialmethod() {
        super.grandParent(); /*
                              * if we remove super from here then it'll
                              * call Parent class(this class)'s grandParent() method
                              */
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.grandParent();
        p.trialmethod();
    }
}
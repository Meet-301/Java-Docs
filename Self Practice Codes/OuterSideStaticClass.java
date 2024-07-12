class OuterSideClass {
    static class InnerClass {
        InnerClass() {
            System.out.println("Hello!!");
        }
    }
}

class InsideClass {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        OuterSideClass.InnerClass ic = new OuterSideClass.InnerClass();
    }
    
}
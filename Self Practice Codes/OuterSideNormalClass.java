class OuterSideClass {
    class InnerClass {
        InnerClass() {
            System.out.println("Hello!!");
        }
    }
}

class InsideClass {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        OuterSideClass oc = new OuterSideClass();
        OuterSideClass.InnerClass ic = oc.new InnerClass();
    }
    
}
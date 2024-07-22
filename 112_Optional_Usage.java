import java.util.Optional;

class OptionalUsage {

    @SuppressWarnings("static-access")
    Optional<String> setOptional(String str) {

        Optional<String> val = Optional.empty();

        if (!str.isEmpty()) {
            val.of(str);   
        }

        return val;
    }

    public static void main(String args[]) {
        System.out.println("\nOptional Class Usage\n");


    }
}
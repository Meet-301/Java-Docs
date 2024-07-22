import java.util.Optional;

class OptionalUsage {

    static Optional<String> getUpperCase(String str) {

        if (str.equals(null) || str.equals("")) {
            return Optional.empty();
        }

        return Optional.of(str.toUpperCase());

    }

    public static void main(String args[]) {
        System.out.println("\nOptional Class Usage\n");

        System.out.println(getUpperCase("meet"));
    }
}
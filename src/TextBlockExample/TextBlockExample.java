package TextBlockExample;

public class TextBlockExample {
    public static void main(String[] args) {
        String message = "A-143, 9th Floor, Sovereign Corporate Tower,\n" +
                "Sector-136, Noida,\n" +
                "Uttar Pradesh - 201305";

        String message1 = """
                A-143, 9th Floor, Sovereign Corporate Tower,\s
                Sector-136, Noida,\s
                Uttar Pradesh - 201305""";

        System.out.println(message);
        System.out.println("--------------");
        System.out.println(message1);


    }
}


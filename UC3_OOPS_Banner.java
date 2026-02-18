public class UC3_OOPS_Banner {

    public static void main(String[] args) {

        String line1 = String.join("  ",
                "OOOOO",
                "PPPP",
                "SSSSS"
        );

        String line2 = String.join("  ",
                "O   O",
                "P   P",
                "S"
        );

        String line3 = String.join("  ",
                "O   O",
                "PPPP",
                "SSSS"
        );

        String line4 = String.join("  ",
                "O   O",
                "P",
                "    S"
        );

        String line5 = String.join("  ",
                "OOOOO",
                "P",
                "SSSSS"
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}

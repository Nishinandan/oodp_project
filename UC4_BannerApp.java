 public class UC4_BannerApp {

    public static void main(String[] args) {

        String[] banner = {

        "        ***          ***      ******      *****",
        "      **   **      **   **    **   **    **   **",
        "     **     **    **     **   **   **    **   **",
        "     **     **    **     **   ******      *****",
        "     **     **    **     **   **              **",
        "     **     **    **     **   **              **",
        "      **   **      **   **    **              **",
        "        ***          ***      **        ******"

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
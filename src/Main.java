public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (var e = 10; e > 0; e = e - 1) {
            System.out.print(e + " ");
        }

        for (int r = 3; r <= 31; r = r + 7) {
            System.out.println("\n" + "Сегодня пятница," + r + "число. Необходимо подготовить отчет.");
        }

        int y = 2021, z = y - 200, m = y + 100;
        for (int a = 0; a < m; a = a + 79) {
            if (a < z) {
                continue;
            }
            if (a < z) {
                break;
            }

            System.out.println(a);
        }


    }
}
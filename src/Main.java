import java.time.LocalDate;
class Homework {
    public static void main(String[] args) {
        printIsLeapYear(2024);
        choosingVersion(1, 2022);
        calculateDeliveryDays(1);
        getVersionByYear(1);
    }
    /*
     *
     * @param yearsIsLeap -
     * @param years -год
     */

    public static void printIsLeapYearsResult(int year, boolean yearsIsLeap) {
        if (yearsIsLeap) {
            System.out.println(year + "високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }

    public static void printIsLeapYear(int year) {
        boolean yearsIsLeap = isLeap(year);
        printIsLeapYearsResult(year, yearsIsLeap);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year * 100 != 0 || year % 400 == 0;
    }

    //task2
    public static void choosingVersion(int os, int yearManufacture) {
        String osType = " ";
        switch (os) {
            case 0:
                osType = "IOS";
                break;
            case 1:
                osType = "ANDROID";
                System.out.printf("Установите %s версию для %s по ссылке", getVersionByYear(yearManufacture), osType);
        }
        System.out.println();
    }

    public static String getVersionByYear(int yearManufacture) {
        if (yearManufacture < LocalDate.now().getYear()) {
            return "light";
        } else {
            return "";
        }

    }


    //task 3

    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            deliveryDays = 0;
            System.out.println(" не возможно расчитать срок доставки");
        }
        if (deliveryDays != 0) {
            System.out.printf("Потребуется дней:" + deliveryDays);
        }
    }


    }


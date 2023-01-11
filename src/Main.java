class Homework {
    public static void main(String[] args) {
        printIsLeapYear(2024);
        recommendApplicationVersion(0, 1990);
        calculateDeliveryDays()
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
    public static void recommendApplicationVersion(int clientIos, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite");
        }
        System.out.print("версию для ");
        if (clientIos == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
        //task 3
        public static void calculateDeliveryDays(int deliveryDistance){
            int deliveryDays =1;
            if (daliveryDistance>20){
                deliveryDays++;
            }
            if (deliveryDistance)

        }

    }
}


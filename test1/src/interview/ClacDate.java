package interview;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * 输入某年的月、日，查询该天是该年的第几天
 */
public class ClacDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon, year, date, flag;
        do {
            System.out.println("输入年：");
            year = sc.nextInt();
            System.out.println("输入月：");
            mon = sc.nextInt();
            System.out.println("输入日：");
            date = sc.nextInt();
            date(year, mon, date);
            System.out.println(date(year, mon, date));
            System.out.println("继续按 1");
            flag = sc.nextInt();
        } while (flag == 1);

    }

    public static String date(int y, int m, int d) {
        int days = 0;
        if (m < 1 || m > 12) {
            return "月份不合理";
        }
        if (d < 1 || d > 31) {
            return "天数不合理";
        }
        boolean flag = false;
        if ((Math.abs(y) % 4 == 0 && Math.abs(y) % 100 != 0) || Math.abs(y) % 400 == 0) {
            flag = true;//是瑞年2月29天
            if (m == 2) {
                if (d > 29) {
                    return "闰年2月最多29天";
                }
            }
        } else {
            if (m == 2) {
                if (d > 28) {
                    return "平年2月最多28天";
                }
            }
        }
        while (m != 0) {
            switch (m -= 1) {
                case 1:
                    days += 31;
                    break;
                case 2:
                    if (flag) {
                        days += 29;
                        break;
                    } else {
                        days += 28;
                        break;
                    }

                case 3:
                    days += 31;
                    break;
                case 4:
                    days += 30;
                    break;
                case 5:
                    days += 31;
                    break;
                case 6:
                    days += 30;
                    break;
                case 7:
                    days += 31;
                    break;
                case 8:
                    days += 31;
                    break;
                case 9:
                    days += 30;
                    break;
                case 10:
                    days += 31;
                    break;
                case 11:
                    days += 30;
                    break;
                case 12:
                    days += 31;
                    break;
                default:
                    break;
            }
        }
        days += d;

        return "" + days;
    }
}

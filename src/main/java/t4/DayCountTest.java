package t4;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t4
 * Class(类名): DayCountTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class DayCountTest
{
    public static void main(String[] args)
    {
        int year, month, day;
        Scanner sc;
        boolean isTrue = false;
        do
        {
            isTrue = false;
            sc = new Scanner(System.in);
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            // 判断非法输入
            if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31)
            {
                System.out.println("输入错误，请重新输入！");
                isTrue = true;
            }
        }
        while (isTrue);

        DayCount n = new DayCount();
        n.dayCount(year, month, day);
    }
}

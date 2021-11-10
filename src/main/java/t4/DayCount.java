package t4;

import java.util.Calendar;
import java.util.Date;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t4
 * Class(类名): DayCount
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:40
 * Version(版本): 1.0
 * Description(描述)：
 * 在本关中，你将被要求对命令行输入某年某月某日（多个数字用空格隔开），判断这一天是这一年的第几天，输出结果。
 * 例如：输入2017 1 1，计算得出这是2017年的第一天。
 * int型变量year、month、day分别为年、月、日，判断这一天是这一年的第几天，并输出计算结果。
 * （思路提示：根据输入的月份来循环累计天数，并根据年份判断是否是闰年，因为闰年的2月份会有29天哦！）
 * 测试说明
 * 平台将创建用户补全后的DayCount类的对象，调用对象的dayCount()方法，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * 以下是测试样例：
 * 测试输入：2017 2 1
 * 预期输出：32
 * 测试输入：2017 5 2
 * 预期输出：122
 */

public class DayCount
{
    public void dayCount(int year, int month, int day)
    {
        /********** Begin *********/
        int sum = 0;
        int flag = year % 4;
        switch (month)
        {
            case 1:
                sum = day;
                break;
            case 2:
                sum = day + 31;
                break;
            case 3:
                sum = day + 31 + 29;
                break;
            case 4:
                sum = day + 31 + 29 + 31;
                break;
            case 5:
                sum = day + 31 + 29 + 31 + 30;
                break;
            case 6:
                sum = day + 31 + 29 + 31 + 30 + 31;
                break;
            case 7:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30;
                break;
            case 8:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                sum = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }
        if (flag != 0 && month > 2)
        {
            System.out.println(sum - 1);
        }
        else
        {
            System.out.println(sum);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        int many = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(many);

        /********** End *********/
    }
}

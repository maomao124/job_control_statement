package t2;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t2
 * Class(类名): AdditionCalculatorTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AdditionCalculatorTest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();

        AdditionCalculator result = new AdditionCalculator();
        result.addition(a, n);
    }
}

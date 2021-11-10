package t3;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t3
 * Class(类名): FactorialTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class FactorialTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Factorial f = new Factorial();
        f.factorial(n);
    }
}

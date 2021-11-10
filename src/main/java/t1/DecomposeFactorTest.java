package t1;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t1
 * Class(类名): DecomposeFactorTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class DecomposeFactorTest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        DecomposeFactor df = new DecomposeFactor();
        df.decompose(n);
    }
}

package t3;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t3
 * Class(类名): Factorial
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:37
 * Version(版本): 1.0
 * Description(描述)：
 * factorial()方法将传入变量n。
 * 使用for循环计算正整数n的阶乘并输出。例如，计算5!=5*4*3*2*1=120。
 * 测试输入：4
 * 预期输出：24
 * 测试输入：7
 * 预期输出：5040
 */

public class Factorial
{
    public void factorial(int n)
    {
        /********** Begin *********/
        int s = 1;
        for (int i = n; i > 0; i--)
        {
            s = s * i;
        }
        System.out.println(s);

        /********** End *********/
    }
}

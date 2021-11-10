package t2;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t2
 * Class(类名): AdditionCalculator
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:26
 * Version(版本): 1.0
 * Description(描述)：
 * addition()方法将传入变量a和变量n。
 * 计算sum=a+aa+aaa+aaaa+aa...a (n个a)，并输出sum的值。例如当a=2，n=3时，2+22+222=246，即sum的值为246。
 * 测试输入：2 2
 * 预期输出：24
 * <p>
 * 测试输入：2 3
 * 预期输出：246
 */

public class AdditionCalculator
{
    public void addition(int a, int n)
    {
        /********** Begin *********/
        int s = a;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            //System.out.println(s);
            sum = sum + s;
            s = s * 10 + a;
        }
        System.out.println(sum);

        /********** End *********/
    }
}

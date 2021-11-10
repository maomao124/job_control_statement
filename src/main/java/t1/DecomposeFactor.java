package t1;

/**
 * Project name(项目名称)：作业_控制语句
 * Package(包名): t1
 * Class(类名): DecomposeFactor
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 20:18
 * Version(版本): 1.0
 * Description(描述)：
 * decompose()方法将传入一个变量score，表示小明的课程的成绩。
 * 输出该课程的绩点数值。
 * 测试说明
 * 平台将创建用户补全后的DecomposeFactor类的对象，调用对象的decompose()方法，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 *
 * 以下是测试样例：
 *
 * 测试输入：91
 * 预期输出：4.0
 *
 * 测试输入：78
 * 预期输出：3.0
 */

public class DecomposeFactor
{
    public void decompose(int score)
    {
        /********** Begin *********/
        if (score==100)
        {
            System.out.println("5.0");
        }
        else if (score < 100 && score >= 90)
        {
            System.out.println("4.0");
        }
        else if (score >= 80)
        {
            System.out.println("3.0");
        }
        else if (score >= 70)
        {
            System.out.println("2.0");
        }
        else if (score >= 60)
        {
            System.out.println("1.0");
        }
        else
        {
            System.out.println("0.0");
        }

        /********** End *********/
    }
}

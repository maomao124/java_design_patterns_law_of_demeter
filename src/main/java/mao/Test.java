package mao;

/**
 * Project name(项目名称)：java设计模式_迪米特法则
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/10
 * Time(创建时间)： 22:04
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Agent agent = new Agent();
        agent.setCompany(new Company("某公司"));
        agent.setFans(new Fans("粉丝李四"));
        agent.setStar(new Star("赵六"));

        agent.business();
        agent.meeting();
    }
}

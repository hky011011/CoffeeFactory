package Settings.CoffeeFactory.personnel.visitlimit;

/**
 * @program: coffeefactory
 * @description: 描述能否进入区域的表达式
 * @author: YXJ
 * @date: 2021-10-12 19:42:24
 */
public interface AbstractExpression {
    public boolean interpret(String info);
}

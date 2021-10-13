package Settings.CoffeeFactory.personnel.visitlimit;

/**
 * @program: coffeefactory
 * @description: 拆解表达式并判断合法
 * @author: YXJ
 * @date: 2021-10-12 20:01:22
 */
public class AndExpression implements AbstractExpression {

    private AbstractExpression person = null;

    private AbstractExpression area = null;

    public AndExpression(AbstractExpression person, AbstractExpression area) {
        this.person = person;
        this.area = area;
    }

    public boolean interpret(String info) {
        String[] s = info.split(" enter ");
        return person.interpret(s[0]) && area.interpret(s[1]);
    }

    @Override
    public String toString() {
        return "class AndExpression implements Expression";
    }
}

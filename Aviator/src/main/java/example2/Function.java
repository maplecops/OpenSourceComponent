package example2;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

/**
 * @author maplecops
 * 本例主要讲解自定义函数
 * @version 1.0
 * @date 2020/5/3 10:52
 */
public class Function {

    public static void main(final String[] args) throws Exception{
        Expression exp = AviatorEvaluator.getInstance().compileScript("examples/function.av");
        exp.execute();
    }

}

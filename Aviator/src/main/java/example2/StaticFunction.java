package example2;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.io.IOException;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/4 10:38
 */
public class StaticFunction {

    public static void main(final String[] args) throws NoSuchMethodException, IllegalAccessException, IOException {
        AviatorEvaluator.addStaticFunctions("inner", StaticUtils.class);
        Expression expression = AviatorEvaluator.getInstance().compileScript("examples/staticFunction.av");
        System.out.println(expression.execute());
    }
}

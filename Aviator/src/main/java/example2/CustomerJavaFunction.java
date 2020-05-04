package example2;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;
import com.googlecode.aviator.Expression;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorNil;
import com.googlecode.aviator.runtime.type.AviatorObject;
import com.googlecode.aviator.runtime.type.AviatorString;

import java.util.Map;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/3 11:02
 */
public class CustomerJavaFunction {

    public static void main(final String[] args) {
        AviatorEvaluator.addFunction(new CustomerFunction());
        String expression = "Customer('maple')";
        Expression exp = AviatorEvaluator.getInstance().compile(expression);
        System.out.println(exp.execute(/*exp.newEnv("maple","ccc")*/));
    }

    private static class CustomerFunction extends AbstractFunction {

        @Override
        public String getName() {
            return "Customer";
        }

        @Override
        public AviatorObject call(Map<String, Object> env, AviatorObject arg1) {
            String arg1Str = FunctionUtils.getStringValue(arg1, env);
            String value = env.get(arg1Str) != null ? String.valueOf(env.get(arg1Str)) : arg1Str;
            return new AviatorString(String.format("Your Name's [%s]", value));
        }
    }

}

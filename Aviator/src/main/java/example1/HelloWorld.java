package example1;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.io.IOException;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/2 22:20
 */
public class HelloWorld {

    public static void main(final String[] args) throws IOException {
        helloWorld();
    }

    /**
     * hello world
     * @throws IOException
     */
    private static void helloWorld() throws IOException {
        Expression exp = AviatorEvaluator.getInstance().compileScript("examples/hello.av");
        exp.execute();
    }

    /**
     * 获取到String类型的公式后，传入参数进行计算
     * (推荐使用exp.newEnv()的方式；也可以直接传入HashMap)
     */
    private static void executeWithParam() {
        String expression = "total - value";
        Expression exp = AviatorEvaluator.getInstance().compile(expression);
        Object result = exp.execute(exp.newEnv("total", 100 , "value", 12));
        System.out.println(result);
    }



}

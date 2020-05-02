package example1;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/2 22:20
 */
@Slf4j
public class Main {

    public static void main(final String[] args) throws IOException {
        Expression exp = AviatorEvaluator.getInstance().compileScript("examples/hello.av");
        exp.execute();
    }

}

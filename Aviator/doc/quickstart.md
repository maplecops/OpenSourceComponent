### Aviator快速上手使用

日常开发工作中，很多场景都需要我们提前定义好公式，通过传入不同的参数，动态的计算是否满足条件(达标)。比如营销活动中考察这个用户是否满足活动条件；
或者在报表计算中定义一系列的取数逻辑，在实际计算时进行动态的取数计算等等。
        
通常这些公式我们都会保存在数据库中，在使用时都是String类型的表达式，比如我们在报表计算的场景，
某一计算单元格中使用这样的公式`getColValue('tableName','colName','queryColName','queryColValue')`，
而在实际计算时希望执行的sql是`select colName from tableName where queryColName = queryColValue`。这就要求我们使用自定义公式来满足我们的要求。
在这样的要求下，一款轻量级的、快速的表达式计算引擎就非常重要，也就是本节推荐的Aviatory。
        
[Aviator使用文档](https://www.yuque.com/boyan-avfmj/aviatorscript)

**说明**：本节中的所有例子都来源于上面的文档中，上面的文档介绍和场景都很清晰明白，有时间的话建议大家阅读官方文档，本节只介绍常用的场景

* 运算表达式求值
    
    一个很简单的例子，`1+2+3`，这样一个String类型的表达式，我们应该如何计算，相信大部分同学很难考虑完善。语法检查、数字与计算符号提取，估计都会让很多人头大，
    但是使用Aviator就会变的非常简单。
    
    ```java_holder_method_tree
    Expression exp = AviatorEvaluator.getInstance().compile("1+2+3");
    System.out.println(exp.execute());
    ```
    使用上面两行代码，就可以获取String类型公式的返回值。
    
* 多元表达式求值

    当然了，实际开发场景中，很少出现写固定表达式的场景`1+2+3`，这种场景和直接写`6`其实没有什么区别，大多数场景都是定义多元表达式的。
    比如定义如下公式`a+b-c`，对于这种场景，Aviator也有着很好的支持，基本上也是两行代码就可以搞定。
    ```java_holder_method_tree
        Expression exp = AviatorEvaluator.getInstance().compile("a+b-c");
        System.out.println(exp.execute(exp.newEnv("a", 1 , "b", 2, "c", 3)));
    ```
    对于多元表达式，在计算时，只需要使用HashMap类型的参数，将每一个参数对应的实际值传入即可；Map的key是参数的元，value则是实际传入的值。

* 自定义函数
    
    在实际开发中，除了这种表达式计算外，也少不了自定义函数的场景，我们需要自己自定义一个函数，并且在公式定义时使用我们提供的自定义函数。
    如下我们定义一个Hello的函数，主要功能就是对传入参数进行说Hello
    ```java
        class HelloFunction extends AbstractFunction {
    
            @Override
            public String getName() {
                return "hello";
            }
    
            @Override
            public AviatorObject call(Map<String, Object> env, AviatorObject arg1) {
                String arg1Str = FunctionUtils.getStringValue(arg1, env);
                String value = env.get(arg1Str) != null ? String.valueOf(env.get(arg1Str)) : arg1Str;
                return new AviatorString(String.format("Hello [%s]", value));
            }
        }
    ```
    在自定义函数时，必须继承`com.googlecode.aviator.runtime.function.AbstractFunction`类，并且重写`getName()`方法，该方法用于指定这个自定义函数的名称。
    同时我们不难发现，`AbstractFunction`中，定义了很多`call(*)`方法，不同的是这些方法的入参个数不同，我们在自定义函数时，需要按照实际情况进行重载。
    
    ```java_holder_method_tree
    public static void main(final String[] args) {
        AviatorEvaluator.addFunction(new CustomerFunction());
        String expression = "hello('maple')";
        Expression exp = AviatorEvaluator.getInstance().compile(expression);
        System.out.println(exp.execute(/*exp.newEnv("maple","ccc")*/));
    }
   ```
    在使用自定义函数时，我们需要先使用`AviatorEvaluator.addFunction(new HelloFunction());`方法将我们的自定义函数进行注册，注册成功后即可使用，还是非常简单的。
    
#### 最后
    
    这里只写了最常用的几种方式，还是非常建议大家学习一下原作者的代码和指导文档，写的真的是非常详细。
# OpenSourceComponent
好用的开源组件

### 1. GoogleCodeAviator
Aviator是一款轻量级的引擎表达式，特点除了*高性能*、*轻量级*之外，还有很好的拓展能力，有比较高的*自定义函数接入*能力。

Aviator是一款由一位国内大佬编写，所以也有着很方便的中文quick start手册。

[地址](https://github.com/killme2008/aviator)
```xml
<!-- https://mvnrepository.com/artifact/com.googlecode.aviator/aviator -->
<dependency>
    <groupId>com.googlecode.aviator</groupId>
    <artifactId>aviator</artifactId>
    <version>5.0.0</version>
    <exclusions>
        <exclusion>
            <artifactId>commons-beanutils</artifactId>
            <groupId>commons-beanutils</groupId>
        </exclusion>
    </exclusions>
</dependency>
```
Aviator接入案例地址为`./Aviator`路径下
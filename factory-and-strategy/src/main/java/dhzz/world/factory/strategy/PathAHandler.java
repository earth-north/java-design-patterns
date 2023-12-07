package dhzz.world.factory.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class PathAHandler implements PathHandler{
    private final Map<String, Function<String, String>> methodMap;

    public PathAHandler() {
        methodMap = new HashMap<>();
        methodMap.put("GET_IT", this::testA);
        methodMap.put("GET_METER", this::testA);
        // 添加其他方法的映射...
    }

    @Override
    public String execute(String methodName, String data) {
        Function<String, String> method = methodMap.getOrDefault(methodName, this::defaultMethod);
        return method.apply(data);
    }

    private String defaultMethod(String data) {
        // 返回报错信息
        return null;
    }


    private String testA(String data) {
        // 实现方法A的逻辑
        return null;
    }

    private String testB(String data) {
        // 实现方法B的逻辑
        return null;
    }
}

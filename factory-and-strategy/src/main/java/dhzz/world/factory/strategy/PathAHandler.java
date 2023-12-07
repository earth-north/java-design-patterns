package dhzz.world.factory.strategy;

public class PathAHandler implements PathHandler{
    @Override
    public void execute(String methodName, String data) {
        if (methodName.equals("methodA")) {
            // 实现方法A的逻辑
        } else if (methodName.equals("methodB")) {
            // 实现方法B的逻辑
        }
        // 其他方法的逻辑...
    }
}

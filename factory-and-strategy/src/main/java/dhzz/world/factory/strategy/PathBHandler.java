package dhzz.world.factory.strategy;

public class PathBHandler implements PathHandler{
    @Override
    public String execute(String methodName, String data) {
        return switch (methodName) {
            case "GET_IT" -> testA(data);
            case "GET_METER" -> testB(data);
            default -> "不支持的methodName: " + methodName;
        };
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

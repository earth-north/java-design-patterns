package dhzz.world.factory.strategy;

public class YourWebService {
    private final PathHandlerFactory handlerFactory = new PathHandlerFactory();

    public String invoke(String path, String methodName, String data) {
        PathEnum pathEnum = getPathEnum(path);
        if (pathEnum != null) {
            PathHandler pathHandler = handlerFactory.createPathHandler(pathEnum);
            return pathHandler.execute(methodName, data);
        } else {
            // 抛出不支持的异常
            return "不支持的path: " + path;
        }
    }

    private PathEnum getPathEnum(String path) {
        for (PathEnum pathEnum : PathEnum.values()) {
            if (pathEnum.getPath().equals(path)) {
                return pathEnum;
            }
        }
        return null;
    }

}

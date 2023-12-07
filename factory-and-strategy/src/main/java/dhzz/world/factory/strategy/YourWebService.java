package dhzz.world.factory.strategy;

public class YourWebService {
    private PathHandlerFactory handlerFactory = new PathHandlerFactory();

    public void invoke(String path, String methodName, String data) {
        PathEnum pathEnum = getPathEnum(path);
        PathHandler pathHandler = handlerFactory.createPathHandler(pathEnum);

        if (pathHandler != null) {
            pathHandler.execute(methodName, data);
        } else {
            // 处理找不到处理类的情况
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

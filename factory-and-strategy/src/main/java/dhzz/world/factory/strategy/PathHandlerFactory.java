package dhzz.world.factory.strategy;

public class PathHandlerFactory {
    public PathHandler createPathHandler(PathEnum pathEnum) {
        if (PathEnum.PATH_A.equals(pathEnum.getPath())) {
            return new PathAHandler();
        } else if (PathEnum.PATH_B.equals(pathEnum.getPath())) {
            return null;
        }
        // 其他路径的处理类...
        return null; // 或者抛出异常
    }
}

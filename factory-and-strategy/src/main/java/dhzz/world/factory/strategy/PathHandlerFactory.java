package dhzz.world.factory.strategy;

public class PathHandlerFactory {
    public PathHandler createPathHandler(PathEnum path) {
        return switch (path) {
            case PATH_A -> new PathAHandler();
            case PATH_B -> new PathBHandler();
        };
    }
}

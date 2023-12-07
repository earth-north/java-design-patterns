package dhzz.world.factory.strategy;

public enum PathEnum {
    PATH_A("my/server/path/Apath"),
    PATH_B("my/server/path/Bpath");
    // 其他路径...

    private final String path;

    PathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

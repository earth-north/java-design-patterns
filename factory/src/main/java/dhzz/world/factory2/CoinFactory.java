package dhzz.world.factory2;

public class CoinFactory {
    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}

package dhzz.world.factory2;

import jdk.jfr.ContentType;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        LOGGER.info("The alchemist begins his work.");
        Coin coin1 = CoinFactory.getCoin(CoinType.COPPER);
        Coin coin2 = CoinFactory.getCoin(CoinType.GOLD);
        LOGGER.info(coin1.getDescription());
        LOGGER.info(coin2.getDescription());
    }
}

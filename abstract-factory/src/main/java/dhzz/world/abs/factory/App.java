package dhzz.world.abs.factory;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("elf kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("orc kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }
//        KingdomFactory factory = new ElfKingdomFactory();
//        Castle castle = factory.createCastle();
//        King king = factory.createKing();
//        Army army = factory.createArmy();
//
//        LOGGER.info(castle.getDescription());
//        LOGGER.info(king.getDescription());
//        LOGGER.info(army.getDescription());

    /**
     * Creates kingdom.
     * @param kingdomType type of kingdom
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setArmy(kingdomFactory.createArmy());
        kingdom.setCastle(kingdomFactory.createCastle());
    }
}

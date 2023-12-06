package dhzz.world.abs.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * Helper class to manufacture {@link KingdomFactory} beans.
 */
@Getter
@Setter
public class Kingdom {

    private King king;
    private Castle castle;
    private Army army;

    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {

        /**
         * Enumeration for the different types of kingdoms.
         */
        public enum KingdomType {
            ELF,ORC
        }

        /**
         * The factory method to create KingdomFactory concrete objects.
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            return switch (type) {
                case ELF -> new ElfKingdomFactory();
                case ORC -> new OrcKingdomFactory();
                default -> throw new IllegalArgumentException("KingdomType not supported.");
            };
        }
    }
}

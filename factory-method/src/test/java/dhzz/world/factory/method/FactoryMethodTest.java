package dhzz.world.factory.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryMethodTest {

    /**
     * Testing {@link OrcBlacksmith} to produce a SPEAR asserting that the Weapon is an
     * instance of {@link OrcWeapon}.
     */
    @Test
    void testOrcBlacksmithWithSpear() {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, OrcWeapon.class);
    }

    /**
     * Testing {@link OrcBlacksmith} to produce a AXE asserting that the Weapon is an
     * instance of {@link OrcWeapon}.
     */
    @Test
    void testOrcBlacksmithWithAxe() {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        verifyWeapon(weapon, WeaponType.AXE, OrcWeapon.class);
    }

    /**
     * Testing {@link ElfBlacksmith} to produce a SHORT_SWORD asserting that the Weapon is an
     * instance of {@link ElfWeapon}.
     */
    @Test
    void testElfBlacksmithWithShortSword() {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        verifyWeapon(weapon, WeaponType.SHORT_SWORD, ElfWeapon.class);
    }

    /**
     * Testing {@link ElfBlacksmith} to produce a SPEAR asserting that the Weapon is an
     * instance of {@link ElfWeapon}.
     */
    @Test
    void testElfBlacksmithWithSpear() {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, ElfWeapon.class);
    }



    /**
     * This method asserts that the weapon object that is passed is an instance of the clazz and the
     * weapon is of type expectedWeaponType.
     *
     * @param weapon                weapon object which is to be verified
     * @param expectedWeaponType    expected WeaponType of the weapon
     * @param clazz                 expected class of the weapon
     */
    private void verifyWeapon(Weapon weapon, WeaponType expectedWeaponType, Class<?> clazz) {
        assertTrue(clazz.isInstance(weapon), "Weapon must be an object of: " + clazz.getName());
        assertEquals(expectedWeaponType, weapon
                .getWeaponType(), "Weapon must be of weaponType: " + expectedWeaponType);

    }
}

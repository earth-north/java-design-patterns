package dhzz.world.factory.method;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("apear"),
    AXE("axe"),
    UNDEFINED("undefined");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}

package dhzz.world.two_cent_principle;

public class App {
    private static final Double[] basePoint = {22.52, 22.07, 21.56};
    private static final Double multiplier = 0.0025;

    public static void main(String[] args) {
        for (int i = 0; i < basePoint.length; i++) {
            double v = basePoint[i];
            double entryPoint = v * (0.98 - multiplier * i);
            double exitPoint = v * (1.02 + multiplier * i);
            if (i > 0) {
                // 修改 v 的值，不能低于 lastEntryPoint
                int j = i - 1;
                double lastEntryPoint = basePoint[j] * (0.98 - multiplier * j);
                if (exitPoint < lastEntryPoint) {
                    exitPoint = lastEntryPoint * (1.02 + multiplier * i);
                }
            }
            System.out.printf("%.2f", entryPoint);
            System.out.print("@" + v + "@");
            System.out.printf("%.2f%n", exitPoint);
        }
    }
}

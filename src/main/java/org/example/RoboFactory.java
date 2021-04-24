package org.example;

public class RoboFactory {

    private final RoboProductionLine roboProductionLine;
    final int productionSize;

    public RoboFactory(RoboProductionLine roboProductionLine, int productionSize) {
        this.roboProductionLine = roboProductionLine;
        this.productionSize = productionSize;
    }

    public void runProduction() {
        int robotsCompleted = 0;
        while (robotsCompleted < productionSize) {
            roboProductionLine.work();
            robotsCompleted++;
        }
    }
}

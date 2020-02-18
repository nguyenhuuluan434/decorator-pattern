package com.decorator.demo_decorator;

import com.decorator.demo_decorator.impl.*;
import org.junit.jupiter.api.Test;

public class FlowerBouquetTest {

    @Test
    public void testDecorator() {
        RoseBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription()
                + " $ " + roseBouquet.cost());

        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapperDecorator(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBowDecorator(decoratedRoseBouquet);
        decoratedRoseBouquet = new GlitterDecorator(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription()
                + " $ " + decoratedRoseBouquet.cost());

    }
}

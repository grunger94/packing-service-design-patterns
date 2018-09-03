package shipment.impl.air;

import shipment.DeliveryTimeEnum;
import shipment.Shipping;
import shipment.ShippingModeFactory;

public class AirShippingFactory implements ShippingModeFactory {

    private static AirShippingFactory uniqueInstance = null;

    private AirShippingFactory() {
    }

    public static AirShippingFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AirShippingFactory();
        }
        return uniqueInstance;
    }

    @Override
    public Shipping create(DeliveryTimeEnum deliveryTimeEnum) {
        Shipping shipping = null;

        if (deliveryTimeEnum.equals(DeliveryTimeEnum.EXPRESS)) {
            shipping = new ExpressAirShipping();
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.REGULAR)) {
            shipping = new RegularAirShipping();
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.SLOW)) {
            shipping = new SlowAirShipping();
        }

        return shipping;
    }
}

package abstractFactory;

import abstractFactory.factory_implementations.WarriorExchangeFactory;
import abstractFactory.factory_implementations.WizardExchangeFactory;
import abstractFactory.factory_interfaces.ExchangeFactory;

public class Factory {
    enum Type{
        WARRIOR, WIZARD
    }
    Type type;

    public ExchangeFactory getFactory(Type type){
        switch (type) {
            case WARRIOR:
                return new WarriorExchangeFactory();
            case WIZARD:
                return new WizardExchangeFactory();
            default:
                return null;
        }
    }

    private static Factory instance = new Factory();

    public static Factory getInstance() {
        return instance;
    }

    private Factory(){}
}

package pricing.strategies;

import pricing.ShipmentCalculatorContext;

/*
interface dedicated to be implemented by classes which are to be injected into discount calculator class
as is the only method does not return anything
this choice was made due to ambiguity of how logging suppose to work,
easily changeable to boolean, response from this method would allow to track what operations if any were done
 */
public interface DiscountStrategy {
    void apply(ShipmentCalculatorContext context);
}

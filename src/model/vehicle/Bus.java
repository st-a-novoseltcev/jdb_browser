package model.vehicle;

import model.vehicle.exception.*;

/**
 * Represents a bus extended from {@link Vehicle}
 * @author <a href="https://github.com/st-a-novoseltcev">Novoseltcev Stanislav</a>
 * @version 1.0
 */
public class Bus extends Vehicle{
    /**
     * @param brand model.vehicle brand, as example "Ikarus"
     * @param model model.vehicle brand, as example "280"
     * @param maxCargoWeight weight of the transported cargo
     * @param numPassengers number of passengers
     * @throws InvalidBrandExceptions passing an invalid brand to the constructor
     * @throws InvalidModelExceptions passing an invalid model to the constructor
     * @throws InvalidMaxCargoWeightExceptions passing an invalid maxCargoWeight to the constructor
     * @throws InvalidNumPassengerExceptions passing an invalid numPassengers to the constructor
     */
    public Bus(String brand, String model, int maxCargoWeight, int numPassengers) throws InvalidNumPassengerExceptions, InvalidMaxCargoWeightExceptions, InvalidModelExceptions, InvalidBrandExceptions {
        check(brand, model, maxCargoWeight, numPassengers);

        this.brand = brand;
        this.model = model;
        this.maxCargoWeight = maxCargoWeight;
        this.numPassengers = numPassengers;
        this.name = Name.BUS.name();
        this.thresholdSpeed = 90;

    }

    public void checkMaxCargoWeight(int maxCargoWeight) throws InvalidMaxCargoWeightExceptions {
        checkMaxCargoWeight(maxCargoWeight, 0, 10000);
    }

    public void checkNumPassengers(int numPassengers) throws InvalidNumPassengerExceptions {
        checkNumPassengers(numPassengers, 8);
    }
}
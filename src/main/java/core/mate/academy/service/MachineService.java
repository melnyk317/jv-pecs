package core.mate.academy.service;

import java.util.List;

import core.mate.academy.model.Machine;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<T extends Machine> {

    /**
     * Return the list of machines.
     * In the implementation of this method please use your MachineProducer implementations
     * See that 'Class type' is not parametrized.
     * Consider to parametrize this Class< PARAMETRIZE_ME > with specific wildcard bounding
     *
     * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     * @throws ThereIsNoSuchMachineExeption 
     */
    List<T> getAll(Class<? extends T> type) throws ThereIsNoSuchMachineExeption;

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     * @throws ThereIsNoSuchMachineExeption 
     */
    void fill(List<? super T> machines, T value);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<? extends T> machines);
}

package core.mate.academy.service;

public class ThereIsNoSuchMachineExeption extends RuntimeException {
    public ThereIsNoSuchMachineExeption(String message) {
        super(message);
    }
}

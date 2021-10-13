package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

public class CoffeeAssemblyLine extends AssemblyLine {
    @Override
    public Coffee getCoffee() {
        return new Coffee();
    }
}

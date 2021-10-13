package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

//这个类用于获得我们特定的coffee生产线
public class CoffeeFactoryProducer {
    //这个方法用于获得我们特定的coffee生产线
    public static AssemblyLine newChocoMachine(String factoryName) {
        return new CoffeeAssemblyLine();
    }
}

package creational.design.patterns.abstractfactory.pattern;

// Concrete factory to create Azure-specific Compute and Storage instances.
class AzureResourceFactory implements CloudResourceFactory {
    public Compute createCompute() {
        return new AzureCompute();
    }

    public Storage createStorage() {
        return new AzureStorage();
    }
}

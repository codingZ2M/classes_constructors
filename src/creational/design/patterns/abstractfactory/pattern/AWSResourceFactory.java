package creational.design.patterns.abstractfactory.pattern;

// Concrete factory to create AWS-specific Compute and Storage instances
class AWSResourceFactory implements CloudResourceFactory {
    public Compute createCompute() {
        return new AWSCompute();
    }

    public Storage createStorage() {
        return new AWSStorage();
    }
}
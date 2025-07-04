package creational.design.patterns.abstractfactory.pattern;

// Implements Compute for Azure by simulating VM creation on Azure.
class AzureCompute implements Compute {
	
    public void launchInstance() {
        System.out.println("Launching VM on Azure");
    }
    
}
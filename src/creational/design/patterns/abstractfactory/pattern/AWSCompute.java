package creational.design.patterns.abstractfactory.pattern;

// Implements Compute for AWS by simulating EC2 instance creation.
class AWSCompute implements Compute {
	
	@Override
    public void launchInstance() {
        System.out.println("Launching EC2 instance on AWS");
    }
    
}
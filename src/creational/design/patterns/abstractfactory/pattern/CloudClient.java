package creational.design.patterns.abstractfactory.pattern;

// Client class that uses the abstract factory to interact with cloud services without depending on a specific provider.
public class CloudClient {
	
    public static void main(String[] args) {
    	
        // Let's say we choose AWS at runtime
        CloudResourceFactory factory = new AWSResourceFactory();

        
        /* Create a family of related objects (like AWSCompute and AWSStorage) without specifying their exact concrete 
           classes in the client code.
         */
        Compute compute = factory.createCompute();
        Storage storage = factory.createStorage();

        compute.launchInstance();         // Output: Launching EC2 instance on AWS
        storage.storeFile("data.txt");    // Output: Storing file in AWS S3: data.txt
    }
}

/*
  👇 Explanation:
	🔸 The "Family" of Related Objects:
		For AWS → AWSCompute and AWSStorage
		For Azure → AzureCompute and AzureStorage
 */

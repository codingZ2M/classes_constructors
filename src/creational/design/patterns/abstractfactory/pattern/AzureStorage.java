package creational.design.patterns.abstractfactory.pattern;

// Implements Storage for Azure by simulating file storage in Azure Blob Storage.
class AzureStorage implements Storage {
	
    public void storeFile(String filename) {
        System.out.println("Storing file in Azure Blob Storage: " + filename);
    }
    
}

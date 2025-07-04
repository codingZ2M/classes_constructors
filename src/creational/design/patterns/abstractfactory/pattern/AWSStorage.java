package creational.design.patterns.abstractfactory.pattern;

// Implements Storage for AWS by simulating file storage in S3.
class AWSStorage implements Storage {
	
    public void storeFile(String filename) {
        System.out.println("Storing file in AWS S3: " + filename);
    }
    
}

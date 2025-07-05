package creational.design.patterns.abstractfactory.pattern;

// Abstract factory interface for creating a family of related objects (Compute + Storage), depending on the cloud provider.
public interface CloudResourceFactory {
	
	   Compute createCompute();
	    Storage createStorage();
}

/*
Creational Design Patterns(Abstract Factory Pattern):
💡 Use When:
	You need to create a family of related objects without specifying exact classes.
*/


/*
✅ Real-World Scenario: Cloud Service Provider Factory
Imagine you're building a system that can deploy resources on multiple cloud platforms like:
	AWS (Amazon Web Services)
	Azure (Microsoft)
	GCP (Google Cloud Platform)

Each cloud provider offers different services, like:
	Compute (virtual machines)
	Storage (file buckets or blobs)

You want to create these services without hard coding the cloud provider into your business logic.

🏗️ Abstract Factory Solution
	You define an abstract factory to create a family of related objects (Compute + Storage), depending on the cloud provider.
*/



/*
🧠 Why This is a Great Real-World Example:
| Benefit                  | Reason                                                                    |
| ------------------------ | ------------------------------------------------------------------------- |
| Decouples provider logic | You can switch from AWS to Azure without touching the core business code. |
| Groups related services  | Compute and Storage are logically grouped by cloud provider.              |
| Supports scalability     | You can easily add GCP or OracleCloud without modifying existing code.    |

*/


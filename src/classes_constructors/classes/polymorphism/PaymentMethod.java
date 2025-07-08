package classes_constructors.classes.polymorphism;

/*
 Polymorphism means "many forms" — the ability of an object to take on multiple behaviors through 
 a common interface or superclass.
 
 You can use one reference type (like a base class) to point to objects of different subtypes — and 
 invoke different behaviors based on the actual object type.
 
 The same method call behaves differently depending on the actual object.
 
 💡 Scenario:
	A large e-commerce app accepts multiple payment methods:
		Credit Card
		PayPal
		UPI
		
 Summary:
✅ Subclasses override methods.
✅ Same method name, different behavior.
✅ Based on runtime type, not declared type.(Runtime polymorphism, also known as dynamic method dispatch)
 */

public interface PaymentMethod {
	
    void pay(double amount);
}




/*
 ✅ Advantages of Polymorphism
 | Advantage                    | Description                                                                                             |
| ---------------------------- | ------------------------------------------------------------------------------------------------------- |
| **Code Reusability**         | You can reuse code that works with a superclass or interface, and it will work with all subclasses.     |
| **Extensibility**            | You can add new subclasses without modifying existing code — Open/Closed Principle.                     |
| **Loose Coupling**           | Promotes programming to interfaces, making code more flexible and testable. 
                               | Ex: PaymentProcessor depends only on the PaymentMethod interface, not on CreditCardPayment or
                                     any specific implementation.
| **Simplifies Code**          | Enables writing simpler, cleaner code that works on abstract types instead of concrete implementations. |
| **Improves Maintainability** | Changes to a subclass do not affect the superclass or unrelated subclasses.                             |

 */
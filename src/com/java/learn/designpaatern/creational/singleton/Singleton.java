package com.java.learn.designpaatern.creational.singleton;


public class Singleton {
	
	private Singleton(){}
	
	private static class SingletonHelpper{
		
		private final static Singleton INSTANCE=new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelpper.INSTANCE;
	}
}

/*
 * 

🔹 Step 1️⃣: Private Constructor
   ✔️ Prevents object creation using new Singleton()
   ✔️ Ensures only this class can create the instance
   
🔹 Step 2️⃣: Static Inner Helper Class
   ✔️ This is a static nested class
   ✔️ JVM does NOT load this class immediately
   
🔹 Step 3️⃣: getInstance() Method
   ✔️ First time this method is called:
      JVM loads SingletonHelper
      INSTANCE is created ONCE
   ✔️ Next calls:
      Same instance returned
      No new object created


🧠 JVM INTERNAL FLOW (IMPORTANT)
🔸 App starts

Singleton class loaded
SingletonHelper ❌ NOT loaded
No object created

🔸 First getInstance() call

JVM loads SingletonHelper

Creates INSTANCE
Returns the object

🔸 Multiple getInstance() calls

SingletonHelper already loaded
Same object returned

✅ BENEFITS (INTERVIEW GOLD)
⭐ 1️⃣ Lazy Loading

Object created only when needed
Saves memory
Faster application startup

⭐ 2️⃣ Thread Safe

JVM class loading is thread-safe
No chance of multiple instances

⭐ 3️⃣ No synchronized Overhead

Faster than synchronized Singleton
Better performance in high traffic apps

⭐ 4️⃣ Clean & Simple Code

No complex logic
Easy to understand
Interview-friendly

⭐ 5️⃣ Recommended by Experts

Known as Initialization-on-Demand Holder Idiom
Used in production systems

❌ Problems This Pattern Solves
Problem	Solved?
Multiple objects	✅
Thread safety	✅
Lazy loading	✅
Performance issues	✅

 * 
 */

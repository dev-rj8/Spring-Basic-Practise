# Chapter7 - Singleton object having prototype dependency
Which is focusing on below things:

* ProductPrice is Singleton object
* CaliforniaStateTax and NewYorkStateTax are prototype objects
* Prototype doesn't work if it is dependency object for Singleton object - So, Add the proxyMode attribute to @Scope annotation

* Test Case: While creating tax objects it will create the time stamp, so when you create object twice for ProductPrice it should create two new instances for tax object

# Output

 c.p.Chapter7Application                  : chapter7.prototypescopecomplex.ProductPrice@78452606  
 c.prototypescopecomplex.ProductPrice     : Injected State Tax is chapter7.prototypescopecomplex.CaliforniaStateTax@7068e664   
 c.prototypescopecomplex.ProductPrice     : California Tax last updated - 164786 seconds ago.   
 c.p.Chapter7Application                  : Product Final Price - 11.0  
 c.p.Chapter7Application                  : chapter7.prototypescopecomplex.ProductPrice@78452606   
 c.prototypescopecomplex.ProductPrice     : Injected State Tax is chapter7.prototypescopecomplex.CaliforniaStateTax@60db1c0e   
 c.prototypescopecomplex.ProductPrice     : California Tax last updated - 164788 seconds ago.   
 c.p.Chapter7Application                  : Product Final Price - 11.0  
 
 
 
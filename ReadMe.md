In object upcasting:

 1) A reference variable can refer to an object if the object is of the same type as a variable or if it is a subtype.
 2) Upcasting happens implicitly.
 3) All Java objects are polymorphic and can be treated as objects of superclass due to upcasting.

 |==> So the output from the main class should be:
    100
    45
    Premium Fuel!
    Unleaded Fuel!

    But if the code is run from the main class as it is, the output will be:

    100
    45

    In order to get the fueltypes to print, I had to run it from the the driver class.

    I need to figure out what I need to get all 4 lines to print from the main class.
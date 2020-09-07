# Factories and Interfaces

For this simple project I wanted to play around
a bit with the concept of creating Interfaces,
Factories and seperating work a bit in a more professional
fashion - into multiple packages.

In this example, several instances of different
animals can be created, all of which have the
same methods that are common to them. The interesting
part about all of this is that the code is made
in such way, that it would be quite easy to
create new instances of animals, without needing
to call `new` on every instance. This is where
the concept of Factory patterns comes in.

This code is a bare bones example of Factories
and Interfaces implementation. However, becaues
it is so easy, it should be helpful if in the future
a refresher would be required for remembering
how such java concepts and patterns can be easily
utilized.

Regarding the output. At the current state the
`main` class has provided the following output
that could be taken in consideration when looking
into this project more indepth:

```
The Fox sleeps for 1 hours tonight.
The Bunny sleeps tonight for 4 hours.
-----------------------------------------
The Fox plays with a Plushy
The Bunny plays by running arround.
-----------------------------------------
The Fox eats the Bunny.
The Bunny loves Berries!
-----------------------------------------
```
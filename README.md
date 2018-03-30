# Knihovna

This is quite a small project created as an assignment for the Prague School of Economics.
It illustrates the basics of OOP in practice as it abstracts the real world. In this case the goal is to represent Book, Library storing books.

## Structure 
The codde ran in the ``Main`` illustrates the functionality of ``Kniha.java`` class.
``Kniha`` is a class which abstracts a book from the real world.
That being said the constructor accepts following parameters ``String jmeno, int cisloKnihy, String zanr, int pocetStran, Ctenar ctenar``
name of the book, number of the book, the genre of the book, number of pages and the last optional argument is for Reader.

## Library DB
The second part of the project represents the real world library in which instances of books are stored as it usually is in normal libraries.
In this part, generics are being used, solving the problem with storing objects.

## Unit Tests 
In ``DatabazeKnihTest.java`` all methods from the ``DatabazeKnih`` class are tested using JUnit4 framework. 

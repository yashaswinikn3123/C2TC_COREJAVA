package abstractclass;

abstract class Animal

{

abstract void eat();

}

class Herbivores extends Animal

{

void eat()

{

System.out.println("I am a vegetarian");

}

}

class Carnivores extends Animal

{

void eat()

{

System.out.println("I am non-vegetarian");

}

}



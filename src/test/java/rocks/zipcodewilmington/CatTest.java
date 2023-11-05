package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        String expectedName = "Zula";
        Cat cat = new Cat("", new Date(), 0);

        cat.setName(expectedName);
        String actual = cat.getName();

        Assert.assertEquals(expectedName, actual);
    }
    @Test
    public void testSetName1() {
        String expectedName = "Zula";
        String falseName = "Zack";
        Cat cat = new Cat("", new Date(), 0);

        cat.setName(falseName);
        String actual = cat.getName();

        Assert.assertNotEquals(expectedName, actual);
    }

    @Test
    public void testSpeak() {
        String expected = "meow!";

        Cat cat = new Cat ("", new Date(), 0);
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetBirth() {
        Date givenDate = new Date();

        Cat cat = new Cat("", new Date(),0);

        cat.setBirthDate(givenDate);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(givenDate, actual);
    }

    @Test
    public void testEat() {
        Cat cat = new Cat("", new Date(), 0);
        Food catFood = new Food();

        cat.eat(catFood);
        Integer food = 1;
        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(food, actual);
    }
    @Test
    public void testGetID() {
        Integer expected = 123;
        Cat cat = new Cat("", new Date(), expected);

        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void catMammalTest() {
        Boolean expected = true;

        Mammal cat = new Cat("", new Date(),0);

        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);



    }
    @Test
    public void catAnimalTest() {
        Boolean expected = true;

        Animal cat = new Cat("", new Date(), 0);

        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }


}

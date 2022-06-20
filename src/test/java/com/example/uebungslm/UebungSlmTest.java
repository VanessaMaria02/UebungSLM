package com.example.uebungslm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UebungSlmTest {

    UebungSlm uebungSlm = new UebungSlm();

    @Test
    void randomNumberTest1(){
        //Arrange
        //if their is a parameter and expectedResult see RestCalculator
        //Act
        int result = uebungSlm.randomNumber();
        //Assert
        assertTrue(result >= 0);
    }

    @Test
    void randomNumberTest2(){
        //Arrange
        //if their is a parameter and expectedResult see RestCalculator
        //Act
        int result = uebungSlm.randomNumber();
        //Assert
        assertTrue(result <= 100);
    }


}
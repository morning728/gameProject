package com.example.gameproject.Services;

import com.example.gameproject.Models.Charactr;

import java.util.LinkedList;

public class MockCharacterRepository implements ICharacterRepository{
    private LinkedList<Charactr> characterList;
    public MockCharacterRepository(){
        characterList = new LinkedList<Charactr>();
        characterList.add(new Charactr("Dima",19,19500,0,20000));
        characterList.add(new Charactr("Matvey",19,1500,9800000,14000));
    }

    @Override
    public LinkedList<Charactr> getCharactrs() {
        return characterList;
    }
}

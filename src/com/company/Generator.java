package com.company;
/**
 * Created by Paul on 10/13/2016.
 */
public class Generator {
    public String name;
    public int luck;
    public Generator(String n)
    {
        name = n;
    }
    public void perfectRandom()
    {
        luck = (int)(Math.pow((int)(Math.random() * 1000), 2));
    }

}
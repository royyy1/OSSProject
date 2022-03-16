package com.royyy1;


public class Area 
{
    private int length;
    private int breadth;
    public Area()
    {
        
    }

    public Area(int length,int breadth)
    {
        this.length = length;
        this.breadth  = breadth;
    }

    public int area(int length, int breadth)
    {
        return length*breadth;
    }
}
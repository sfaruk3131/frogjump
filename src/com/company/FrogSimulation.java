package com.company;

public class FrogSimulation {
    public int[] testHops;
    public int nextHopIndex;
    private static int maxHops;
    private static int goalDistance;
    private static int currentDistance = 0;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private static int hopDistance()
    {
        int distance = (int)Math.random()*10;
        currentDistance += distance;
        return distance;
    }

    public static boolean simulate()
    {
        for(int i = 0; i < maxHops; i++) {
            hopDistance();
        }
        if(currentDistance >= goalDistance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double runSimulations(int num)
    {
        int wins = 0;
        for(int i = 0; i < num; i++)
        {
            if(simulate())
            {
                wins++;
            }
        }
        return (double)wins/num;
    }
}

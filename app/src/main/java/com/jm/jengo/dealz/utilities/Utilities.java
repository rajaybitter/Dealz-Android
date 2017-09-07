package com.jm.jengo.dealz.utilities;

/**
 * Created by rajay on 9/7/17.
 */

public class Utilities {

    public static long getEpoch(){
        return System.currentTimeMillis();
    }

    public static boolean isTimeUp(long startTime, long timeLimit){
        long timePassed = System.currentTimeMillis() - startTime;
        if (timePassed > timeLimit){
            /**
             * In this scenario, if a product has a for example a 30 min discount period
             * this will check if that 30 min is up. So if 60 min has passed then
             * 60(timePassed) > 30(timeLimit, thus time is up
             */
            return true;
        }
        return false;
    }
}

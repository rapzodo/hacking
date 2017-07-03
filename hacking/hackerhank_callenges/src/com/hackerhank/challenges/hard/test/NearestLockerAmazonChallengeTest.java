package com.hackerhank.challenges.hard.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class NearestLockerAmazonChallengeTest {
		
//	Expected
//	012
//	123
//	234
//	345
//	456
	@Test
	public void solutionTest1() {
		solution(3,5,new int[]{1}, new int[]{1});
	}
	
//	Expected
//	32345
//	21234
//	10123
//	21234
//	32323
//	43212
//	32101
	
//	lenght == i , width = j
	
	
	@Test
	@Ignore
	public void solutionTest2() {
		solution(5,7,new int[]{2,4}, new int[]{3,7});
	}

static int [][] solution(int length, int width, int [] xCordinate, int [] yCordinate) {
        
        int[][] nearestLocker = new int[width][length];
        
        
        
        
        for(int i=0; i<width; i++) {
            
            
            
            for(int j=0; j<length ; j++) {
                
                int tmpMinDist = 0;
                int minDist = 10000000;
                
                for(int k=0; k<xCordinate.length; k++) {
                    
                    tmpMinDist = getAbsoluteValue((xCordinate[k] - i - 1)) + getAbsoluteValue((yCordinate[k] - j - 1));
                    
                    if(minDist > tmpMinDist) {
                        minDist = tmpMinDist;
                    }
                                        
                }
                
                
                    
                
                nearestLocker[i][j] = minDist;
            }
            
        }
        
        return nearestLocker;
    }
    
    
    static int getAbsoluteValue(int val) {
        
        if(val < 0) {
            return val * -1;
        }
        return val;
    }


}

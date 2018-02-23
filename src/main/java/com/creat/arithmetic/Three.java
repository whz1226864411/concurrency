package com.creat.arithmetic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018-02-23.
 */
public class Three {

    @Test
    public void test(){
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Assert.assertEquals(search(array, 3, 3, 5), true);
    }

    public boolean search(int[][] array, int rows, int columns, int num) {
        if (array != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column > 0) {
                int compare = array[row][column];
                if (compare > num) {
                    column--;
                }else if(compare < num) {
                    row++;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}

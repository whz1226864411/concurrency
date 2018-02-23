package com.creat.arithmetic;

import org.junit.Test;

/**
 * Created by Administrator on 2018-02-23.
 */
public class Six {

    private class BinaryTreeNode {
        private int value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;
    }

    @Test
    public void test() {
        int[] beforeArray = new int[]{1,2,4,7,3,5,6,8};
        int[] middleArray = new int[]{4,7,2,1,5,3,8,6};
        BinaryTreeNode root = restructure(beforeArray, 0, beforeArray.length-1,
                middleArray, 0, middleArray.length-1);
        beforePrint(root);
        System.out.println();
        middlePrint(root);
        System.out.println();
        afterPrint(root);
    }

    public void beforePrint(BinaryTreeNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value+" ");
        beforePrint(node.left);
        beforePrint(node.right);
    }

    public void middlePrint(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        middlePrint(node.left);
        System.out.print(node.value+" ");
        middlePrint(node.right);
    }

    public void afterPrint(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        afterPrint(node.left);
        afterPrint(node.right);
        System.out.print(node.value+" ");
    }

    public BinaryTreeNode restructure(int[] beforeArray, int bl, int br,
                                      int[] middleArray, int ml, int mr) {
        BinaryTreeNode root = new BinaryTreeNode();
        int rootValue = beforeArray[bl];
        root.value = rootValue;
        if (bl < br) {
            int rootIndex = ml;
            for (int i = ml; i <= mr; i++) {
                if (middleArray[i] == rootValue) {
                    rootIndex = i;
                    break;
                }
            }
            if (ml < rootIndex) {
                root.left = restructure(beforeArray, bl+1, bl+rootIndex-ml,
                                        middleArray, ml, rootIndex-1);
            }
            if (mr > rootIndex) {
                root.right = restructure(beforeArray, br-(mr-rootIndex)+1, br,
                                        middleArray, rootIndex+1, mr);
            }
        }
        return root;
    }
}

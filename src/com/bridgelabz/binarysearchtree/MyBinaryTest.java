package com.bridgelabz.binarysearchtree;

public class MyBinaryTest {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56) ;
		myBinaryTree.add(30) ;
		myBinaryTree.add(70) ;
		
		int size = myBinaryTree.getSize();
		System.out.println("Size: "+size);
	}
}
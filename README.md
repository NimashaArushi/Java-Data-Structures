🌳 Binary Search Tree (BST) Implementation in Java.
This repository contains a robust implementation of a Binary Search Tree (BST) data structure using Java. It covers fundamental operations such as insertion, searching, and complex deletion, along with tree traversal algorithms.
🚀✨ Features
📥 Insertion: Efficiently adds new nodes while maintaining the BST property ($Left < Root < Right$).
🔍 Searching: Implementation of the search algorithm to locate values in $O(\log n)$ time complexity.
🗑️ Deletion: Handles all three deletion cases:Leaf nodesNodes with one childNodes with two children (using the In-order successor)
🔄 Traversals: Includes three depth-first search strategies:
In-order: Returns values in ascending order.
📈Pre-order: Processes the root before its children.
Post-order: Processes the children before the root.
📏 Tree Height: A recursive function to calculate the maximum depth of the tree.

🛠️ How to Run
1.Clone this repository or copy the code from Binarytree.java.
2.Ensure you have JDK installed.
3.Run the following commands:
Bashjavac Binarytree.java
java Binarytree

# DAA-Hands-on-5

Implemented a min heap data structure. For the parent and left/right functions use bit manipulation operators with the following heap functionalities:

The ability to initially build the heap (build_min_heap). - Done
The ability to heapify. - Done
The ability to get and remove ("pop") the root node from the heap (and of course re-heapify everything). - Done
The heap should be generic to the type of data (can store floats, int, custom datastructure) - Done

# Logic : 
Arr[(i-1)/2]	Returns the parent node
Arr[(2*i)+1]	Returns the left child node
Arr[(2*i)+2]	Returns the right child node


# Examples of your heap working. Demonstrating all the functionalities implemented : 

# The ability to initially build the heap (build_min_heap): 

Input : add([1, 4, 6, 2, 5, 3, 9, 8, 7])

FunctionCall at line 76 -----> minHeap.buildMinHeap(data);

# The ability to heapify:

Output : MinHeap: [1, 2, 3, 4, 5, 6, 9, 8, 7]

# Pop: 

Pop: 1
Heap after pop: [2, 4, 3, 7, 5, 6, 9, 8]

# Push (35) : 

Heap after push(35): [2, 4, 3, 7, 5, 6, 9, 8, 35]


** Process exited - Return Code: 0 **

# Complexity Analysis of Heap Sort: 

Time Complexity: O(N log N)

# Advantages of Heap Sort:
Heaps are used when the highest or lowest order/priority element needs to be removed. They allow quick access to this item in O(1) time. One use of a heap is to implement a priority queue.
Binary heaps are usually implemented using arrays, which save overhead cost of storing pointers to child nodes.

Efficient Time Complexity: Heap Sort has a time complexity of O(n log n) in all cases. This makes it efficient for sorting large datasets. The log n factor comes from the height of the binary heap, and it ensures that the algorithm maintains good performance even with a large number of elements.
Memory Usage – Memory usage can be minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work.
Simplicity –  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion.

# Disadvantages of Heap Sort:
Heaps only provide easy access to the smallest/greatest item. 
Finding other items in the heap takes O(n) time because the heap is not ordered. 
We must iterate through all the nodes.

Costly: Heap sort is costly.
Unstable: Heap sort is unstable. It might rearrange the relative order.
Efficient: Heap Sort is not very efficient when working with highly complex data. 

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> {
    private ArrayList<T> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public void buildMinHeap(ArrayList<T> data) {
        this.heap = new ArrayList<>(data);
        int n = data.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int smallest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChild;
        }

        if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChild;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public void push(T value) {
        heap.add(value);
        int i = heap.size() - 1;
        while (i > 0 && heap.get((i - 1) / 2).compareTo(heap.get(i)) > 0) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public T pop() {
        if (heap.isEmpty()) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        T root = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        heapify(0);
        return root;
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(4);
        data.add(6);
        data.add(2);
        data.add(5);
        data.add(3);
        data.add(9);
        data.add(8);
        data.add(7);
        

        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.buildMinHeap(data);

        System.out.println("Minheap: " + minHeap.heap);  // [ 1, 2, 3, 4, 5, 6, 9, 8, 7 ]
        System.out.println("Pop: " + minHeap.pop()); 
        System.out.println("Heap after pop: " + minHeap.heap); // [ 2, 4, 3, 7, 5, 6, 9, 8 ]
        minHeap.push(35);
        System.out.println("Heap after push(35): " + minHeap.heap); // [ 2, 4, 3, 7, 5, 6, 9, 8, 35 ]
    }
}

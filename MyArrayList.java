package Array_Lists;



public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private final int CAPACITY = 10;

    public MyArrayList() {
        //create an array with an initial size of 10
        elements = new Object[CAPACITY]; //initial capacity
        size = 0; // keeps track of the number of elements
        //that actually exist in our arraylist

    
    }

    public void AddStart(T elementToAdd){
        EnsureCapacity();
        for(int i = size; i >= 0; i--){
            elements[i +1] = elements[i];
        }
        elements[0] = elementToAdd;
        size++;
    }

    public void AddEnd(T elementToAdd){
        EnsureCapacity();;
        elements[size] = elementToAdd;
        size++;
    }

    
    /**
     * Checks the capacity of our elements array and increases its capacity 
     * if there isn't enough space
     */
    private void EnsureCapacity(){
        if(size == elements.length) {
            //increase capacity/size of the array
            Object[] newElements = new Object[elements.length * 2];
            
            for(int i = 0; i < size; i++){
                newElements[i] = elements[i];
            }

            elements = newElements;
        }
    }


    public void AddAtIndex(T elementToAdd, int indexToAddAt){
        if(indexToAddAt > size || indexToAddAt < 0){
            //add to the end if index the user wants to add at if invalid
            AddEnd(elementToAdd);
        } else {
      
            EnsureCapacity();
      
            for(int i = size; i >= indexToAddAt; i--){
            elements[i +1] = elements[i];
            }
            elements[indexToAddAt] = elementToAdd;
            size++;
        }
    }

    /**
     * 
     * @param index of the elements list is entered
     * @return gives back the element at specific index or 
     * the available last index in the list.
     */
    public Object GetElementAtIndex(int index){
        if(index >= size || index < 0){
            return elements[size - 1];
        }

        return elements[index];
    }

    public void Print() {
        for(int i = 0; i < size; i++){
            System.out.print(elements[i] + " ");
        }

        System.out.println();
    }

    public void DeleteAtStart() {
        DeleteATIndex(0);
    }

    public void DeleteAtEnd() {
        DeleteATIndex(size - 1);
    }

    public void DeleteATIndex(int indexOfValueToDelete) {
        if(indexOfValueToDelete < 0 || indexOfValueToDelete >= size) {
            throw new IndexOutOfBoundsException("Index" + indexOfValueToDelete + "Is invalid for ArrayList of size" + size);
        }

        for(int i = indexOfValueToDelete; i < size; i++){
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void ClearAll() {
        for(int i = 0; i < size; i++){
            elements[i] = null;
        }

        size = 0;
    }

    public boolean IsEmpty() {
        return size == 0 ;
    }

    public int Size() {
        return size;
    }
}
     


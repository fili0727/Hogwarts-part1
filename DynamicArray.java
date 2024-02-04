public class DynamicArray {

  private Object[] objectArray;
  private int arraySize;

  public DynamicArray() {
    objectArray = new Object[4];
    arraySize = 0;
  }

  public void add(Object obj) {
    if (arraySize == objectArray.length) {
      size();
    }
    objectArray[arraySize++] = obj;
  }

  public Object get(int index) {
    if (index < 0 || index >= arraySize) {
      return null;
    }
    return objectArray[index];
  }

  public int size() {
    return arraySize;
  }

  public void remove() {
    if (arraySize > 0) {
      objectArray[--arraySize] = null;
    }
  }

  public void remove(int index) {
    if (index < 0 || index >= arraySize) {
      return;
    }
    System.arraycopy(
      objectArray,
      index + 1,
      objectArray,
      index,
      arraySize - index - 1
    );
    objectArray[--arraySize] = null;
  }

  public void set(int index, Object obj) {
    if (index >= 0 && index < arraySize) {
      objectArray[index] = obj;
    }
  }

  public void clear() {
    for (int i = 0; i < arraySize; i++) {
      objectArray[i] = null;
    }
    arraySize = 0;
  }

  private void reSize() {
    Object[] newobjectArray = new Object[objectArray.length * 2];
    System.arraycopy(objectArray, 0, newobjectArray, 0, arraySize);
    objectArray = newobjectArray;
  }
}

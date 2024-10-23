//oh, this is just a simple dynamic array implementation in java
package Arrays;

public class DynamicArrays<TYPE>
{
    private TYPE[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public DynamicArrays()
    {
        data = (TYPE[])new Object[5];
        size = 0;
    }

    public void add(TYPE list)
    {
        if(size >= data.length)
        {
            resize();
        }
        data[size++] = list;
    }

    @SuppressWarnings("unchecked")
    public void resize()
    {
        TYPE [] newData = (TYPE[]) new Object [data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public TYPE get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public int size()
    {
        return size;
    }

    public void remove(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    public void clear()
    {
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public TYPE[] toArray()
    {
        TYPE[] result = (TYPE[]) new Object [size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }
}

class Main {
  public static void main(String[] args) {

        int[] list = {18, 67, 12, 34, 54, 98, 47};

        insertionSort(list);

    }

    public static void insertionSort( int data[] ) {
        int in, out, temp;
        for (out=1; out < data.length; out++) {
            temp = data[out];
            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                data[in] = data[in-1];
            }
            data[in] = temp;
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + " ");
            System.out.println();
        }
    }
}
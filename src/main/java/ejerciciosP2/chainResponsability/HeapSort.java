package ejerciciosP2.chainResponsability;

public class HeapSort implements IHandler{
    private IHandler next;


    public void sort(Persona[]arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            Persona temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(Persona[]arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].getEdad() > arr[largest].getEdad())
            largest = l;

        if (r < n && arr[r].getEdad() > arr[largest].getEdad())
            largest = r;
        if (largest != i) {
            Persona swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }


    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override

    public void criteriaHandler(Persona[] arr) {
        if(arr.length>50){
            System.out.println("Heap Sort esta ordenando");
            sort(arr);
            printArray(arr);

        } else {
            next.criteriaHandler(arr);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }

    public void printArray(Persona[]arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println("Nombre: "+arr[i].getNombre() + ", Edad: "+arr[i].getEdad());
    }
}
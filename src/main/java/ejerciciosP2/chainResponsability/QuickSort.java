package ejerciciosP2.chainResponsability;

class Quicksort implements IHandler {

    private IHandler next;

    static int partition(Persona []array, int low, int high) {

        int pivot = array[high].getEdad();

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j].getEdad() <= pivot) {
                i++;
                Persona temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Persona temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSort(Persona[]array, int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] arr) {
        if(arr.length<=50&&arr.length>20){
            System.out.println("Quick Sort esta ordenando");
            quickSort(arr, 0, arr.length-1);
            printArray(arr);

        } else {
            next.criteriaHandler(arr);
        }
    }

    public void printArray(Persona[]arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println("Nombre: "+arr[i].getNombre() + ", Edad: "+arr[i].getEdad());
    }

    @Override
    public IHandler next() {
        return next;
    }
}



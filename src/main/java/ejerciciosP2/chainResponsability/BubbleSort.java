package ejerciciosP2.chainResponsability;

public class BubbleSort implements IHandler{

    private IHandler next;
    @Override

    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] arr) {
        if(arr.length<=20){
            System.out.println("Bubble Sort esta ordenando");
            bubbleSort(arr);
            printArray(arr);

        } else {
            next.criteriaHandler(arr);
        }
    }
    public void bubbleSort(Persona[]arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getEdad() > arr[j + 1].getEdad()) {
                    // swap arr[j+1] and arr[j]
                    Persona temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

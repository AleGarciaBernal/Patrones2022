package ejerciciosP2.chainResponsability;

public class ManagerHandler implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[]arr) {

        BubbleSort resp1= new BubbleSort();
        this.setNext(resp1);

        Quicksort resp2 = new Quicksort();
        resp1.setNext(resp2);

        HeapSort respFinal = new HeapSort();
        resp2.setNext(respFinal);

        this.next.criteriaHandler(arr);
    }

    @Override
    public IHandler next() {
        return next;
    }
}

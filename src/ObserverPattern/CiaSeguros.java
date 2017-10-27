package ObserverPattern;

public class CiaSeguros implements Observer{
    SistemaDeAlarmeObserver sistema;

    public CiaSeguros(SistemaDeAlarmeObserver s){
        sistema=s;
        sistema.Attach(this);
    }
    public void contataCliente(){
        System.out.println("\nContatando Cliente\n");
    }
    @Override
    public void update() {
        System.out.println("#############Sistema Seguro###############");
        System.out.println(sistema.getRelatorio());
        System.out.println("##########################################");
    }
}

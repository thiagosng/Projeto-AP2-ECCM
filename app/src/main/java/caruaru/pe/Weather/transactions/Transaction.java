package caruaru.pe.Weather.transactions;

public interface Transaction {

    void execute() throws Exception;

    void updateView();
}

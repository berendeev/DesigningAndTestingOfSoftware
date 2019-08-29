import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
            Прикладная область «Выдача кредитов банком». Есть несколько категорий клиентов:
            сами сотрудники банков, как привилегированная категория; обычные граждане; граждане
            с плохой кредитной историей; льготники (например, пенсионеры). Программа должна
            выдавать возможный для каждой категории размер кредита и процентную ставку.
            Алгоритм расчёта размера кредита и процентной ставки отличается для всех категорий
            (сам алгоритм расчёта не столь важен, важно умение применить полиморфизм).
    * */
    public static void main(String[] args) {
        // Demo
        List<Client> clients = new ArrayList<>();

        clients.add(new Civilian(25000));
        clients.add(new Civilian(50000));

        clients.add(new Beneficiary(15000));
        clients.add(new Beneficiary(60000));

        clients.add(new BankEmployee(80000));
        clients.add(new BankEmployee(120000));

        clients.add(new BadCreditHistoryCivilian(15000));
        clients.add(new BadCreditHistoryCivilian(40000));

        for (Client client : clients) {
            System.out.println(client);
        }
    }
}

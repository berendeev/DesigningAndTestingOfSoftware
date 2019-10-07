import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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

    private static final String SALARY_HINT = "Введите зарплату";

    public static void main(String[] args) {
        show();
    }


    public static void show() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.add(mainPanel);

        JTextField inputText = new JTextField();

        inputText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputText.setForeground(Color.BLACK);
                if (inputText.getText().equals(SALARY_HINT)) {
                    inputText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (inputText.getText().isEmpty()) {
                    inputText.setForeground(Color.LIGHT_GRAY);
                    inputText.setText(SALARY_HINT);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Calculate");

        Object[] columnNames = {"Имя", "Процентная ставка", "Размер кредита"};

        button.addActionListener(e -> {
            int salary = Integer.parseInt(inputText.getText());

            List<Client> clients = new ArrayList<>();
            clients.add(new Civilian(salary));
            clients.add(new Beneficiary(salary));
            clients.add(new BankEmployee(salary));
            clients.add(new BadCreditHistoryCivilian(salary));

            Object[][] data = new Object[4][];
            for (int i = 0; i < clients.size(); i++) {
                Client client = clients.get(i);
                data[i] = new Object[]{client.getClass().getName(), client.getInterestRate(), client.getCreditSize()};
            }
            panel.removeAll();
            panel.add(new JScrollPane(new JTable(data, columnNames)));
            frame.revalidate();
        });
        String[][] strings = {{"", "", ""}};
        panel.add(new JScrollPane(new JTable(strings, columnNames)));

        mainPanel.add(inputText, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(500, 200);

        SwingUtilities.invokeLater(() -> {
            inputText.requestFocus();
            button.requestFocus();
        });
    }

}


# CalculatorClient
Program ćwiczebny dla uczestników szkolenia "Spring Integration dla Zielonych"

Zadanie:

1. Sklonuj, lub "sforkuj" repozytorium CalculatorClient
2. Stwórz Konfigurację Spring Integration (integration/integration.xml) do połączenia 
z aplikacją pod adresem http://calculatorweb.herokuapp.com/calculate, używając metody http GET przekaż parametr równiania
(Możesz sprawdzić obsługiwane równiania wchodząc na http://calculatorweb.herokuapp.com)
3. Opdal localhost:8080/clientView i wyślij swoje równanie
4. Stwrórz Transformer, który będzie przerabiał wynik z jsona, na String z wynikiem
5. Dodaj obsługę błędów, przetestuj, wysyłając niedozwolony ciąg znaków, np. "AAA"
6. Gratulacje napisałeś swoją pierwszą integrację :)
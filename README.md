# CalculatorClient
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f86ddbf64a8242b9b25e74a72a045509)](https://www.codacy.com/app/bartlomiej.gora/CalculatorClient?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=bartlomiej-gora/CalculatorClient&amp;utm_campaign=Badge_Grade)

Program ćwiczeniowy dla uczestników szkolenia "Spring Integration na początek"

Zadanie:

1. Sklonuj, lub "sforkuj" repozytorium CalculatorClient
2. Stwórz Konfigurację Spring Integration (integration/integration.xml) do połączenia 
z aplikacją pod adresem http://calculatorweb.herokuapp.com/calculate, używając metody http GET i implementacji wzorca Gateway przekaż
parametr równania
(Możesz sprawdzić obsługiwane równania wchodząc na http://calculatorweb.herokuapp.com)
3. Odpal localhost:8080/clientView i wyślij swoje równanie
4. Stwórz Transformer, który będzie przerabiał wynik z jsona, na String z wynikiem
5. Dodaj obsługę błędów, przetestuj, wysyłając niedozwolony ciąg znaków, np. "AAA"
6. Gratulacje napisałeś swoją pierwszą integrację :)

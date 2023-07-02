# Terminal do zamawiania jedzenia w McDonald's

Ten projekt to implementacja prostego terminala do zamawiania jedzenia w McDonald's w języku Java. Użytkownik może dodawać produkty do koszyka, przeglądać zawartość koszyka, obliczać całkowitą cenę zamówienia oraz składać zamówienie. Dane o zamówieniach są zapisywane w bazie danych PostgreSQL.

## Funkcje

- Dodawanie produktów do koszyka
- Wyświetlanie zawartości koszyka
- Obliczanie całkowitej ceny zamówienia
- Składanie zamówienia i zapisywanie danych do bazy danych

## Wymagania

Aby uruchomić ten projekt, musisz mieć zainstalowane następujące elementy:

- Java Development Kit (JDK) 8 lub nowszy
- PostgreSQL

## Konfiguracja

1. Skonfiguruj bazę danych PostgreSQL:

   - Utwórz nową bazę danych w PostgreSQL.
   - Zaktualizuj `url`, `user` i `password` w pliku `PostgreSQL.java` zgodnie z danymi do Twojej bazy danych.

2. Kompilacja i uruchomienie:

   - Skompiluj pliki źródłowe projektu przy użyciu kompilatora Javy:
     ```
     javac Main.java
     ```
   - Uruchom program:
     ```
     java Main
     ```

## Przykład użycia

1. Wyświetl dostępne produkty do wyboru.
2. Dodaj wybrane produkty do koszyka.
3. Wyświetl zawartość koszyka.
4. Oblicz całkowitą cenę zamówienia.
5. Złóż zamówienie.

##Licencja 
## Licencja

Ten projekt jest udostępniany na licencji MIT.

Możesz swobodnie korzystać, modyfikować i udostępniać ten kod źródłowy w celach niekomercyjnych zgodnie z warunkami licencji MIT.

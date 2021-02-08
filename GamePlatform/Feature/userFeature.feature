
Feature: Основни операции на платформа за игри

  Scenario: Регистрация на потребител в системата
    Given Отваря формичката за регистрация на потребители
    When Въвежда потребителско име "PeterA"
    And Въвежда парола "1234567"
    And Въвежда имейл "p.1999@gmail.com"
    And Въвежда име "Peter"
    And Въвежда фамилия "Angelov"
    And Натиска върху бутона за регистрация в системата.
    Then Виждаме съобщение "Successfully Registered".
    
  Scenario: Показване информацията на потребиля ако съществува
    Given Отваря формичка с търсачка
    When Въвежда потребителско име в търсачката "Peter1"
    And Натиска върху бутона за да покажи потребил в системата.
    Then Вижда информацията за себе си.
   
    
  Scenario: Триене на потребител от системата
    Given Отваря формичка за триене от системата
    When Въвежда потребителско име за триене "Petar1"
    And Натиска бутона Delete
    Then Вижда съобщение за успешно изтриване "Successfully Deleted".
    
  Scenario: Обновяване на потребителската информация в системата
    Given Отваря формичката за ъпдейт на потребителя.
    When Обновява потребителско име "Peter1"
    And Обновява парола "654321"
    And Обновява имейл "p1.1999@gmail.com"
    And Обновява име "Peter"
    And Обновява фамилия "Angelov"
    And Натиска върху бутона за запазване на промените в системата.
    Then Вижда, че информацията е обновена успешно "Successfully Updated".
    
  Scenario: Купуване на игра
    Given Отваря формичка за каталога с игри.
    When Натиска на Buy бутон на някаква игра, се взима самата игра и потребителското име на купувача "Peter1" 
    Then Вижда съобщение "Successfully bought game".
    
  Scenario: Показване на купените игри на даден потребил
    Given Отваря формичка на потребителя
    When Натиска бутона покажи игри и се подава потребителско име "Peter1"
    Then Вижда списък с игри ако има.
    
   Scenario: Купуване на абонамент
    Given Отваря формичка за абонаменти
    When Натиска бутона купи абонамент, се взима абонамента и потребителското име на купувача "Peter1" 
    Then Вижда съобщение за успешно закупен абонамен "Successfully bought subscription".

    
    #Scenario: Показване информацията на потребиля ако не съществува
    #Given Отваря формичка с търсачка
    #When Въвежда потребителско име в търсачката "NONE"
    #And Натиска върху бутона за покажи потребил в системата.
    #Then Вижда съобщение "There's no user with that username".
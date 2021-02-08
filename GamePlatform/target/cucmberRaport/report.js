$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("userFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Основни операции на платформа за игри",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Регистрация на потребител в системата",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;регистрация-на-потребител-в-системата",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Отваря формичката за регистрация на потребители",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Въвежда потребителско име \"PeterA\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Въвежда парола \"1234567\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Въвежда имейл \"p.1999@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Въвежда име \"Peter\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Въвежда фамилия \"Angelov\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Натиска върху бутона за регистрация в системата.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Виждаме съобщение \"Successfully Registered\".",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.openRegistrationForm()"
});
formatter.result({
  "duration": 439203500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PeterA",
      "offset": 27
    }
  ],
  "location": "RegistrationSteps.addUsername(String)"
});
formatter.result({
  "duration": 1955300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567",
      "offset": 16
    }
  ],
  "location": "RegistrationSteps.addPassword(String)"
});
formatter.result({
  "duration": 162700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "p.1999@gmail.com",
      "offset": 15
    }
  ],
  "location": "RegistrationSteps.addEmail(String)"
});
formatter.result({
  "duration": 108600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter",
      "offset": 13
    }
  ],
  "location": "RegistrationSteps.addFirstName(String)"
});
formatter.result({
  "duration": 106600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Angelov",
      "offset": 17
    }
  ],
  "location": "RegistrationSteps.addLastName(String)"
});
formatter.result({
  "duration": 95600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.clickButton()"
});
formatter.result({
  "duration": 152300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully Registered",
      "offset": 19
    }
  ],
  "location": "RegistrationSteps.checkRegistrationMessage(String)"
});
formatter.result({
  "duration": 2898900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Показване информацията на потребиля ако съществува",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;показване-информацията-на-потребиля-ако-съществува",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Отваря формичка с търсачка",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Въвежда потребителско име в търсачката \"Peter1\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Натиска върху бутона за да покажи потребил в системата.",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Вижда информацията за себе си.",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.openForm()"
});
formatter.result({
  "duration": 983400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter1",
      "offset": 40
    }
  ],
  "location": "ProfileSteps.addUsername(String)"
});
formatter.result({
  "duration": 387800,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickSearchButton()"
});
formatter.result({
  "duration": 5838800,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.showMessage()"
});
formatter.result({
  "duration": 94400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Триене на потребител от системата",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;триене-на-потребител-от-системата",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Отваря формичка за триене от системата",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Въвежда потребителско име за триене \"Petar1\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Натиска бутона Delete",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Вижда съобщение за успешно изтриване \"Successfully Deleted\".",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteSteps.openForm()"
});
formatter.result({
  "duration": 762500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petar1",
      "offset": 37
    }
  ],
  "location": "DeleteSteps.addUsername(String)"
});
formatter.result({
  "duration": 304000,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSteps.clickDeleteButton()"
});
formatter.result({
  "duration": 708000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully Deleted",
      "offset": 38
    }
  ],
  "location": "DeleteSteps.showMessage(String)"
});
formatter.result({
  "duration": 100600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Обновяване на потребителската информация в системата",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;обновяване-на-потребителската-информация-в-системата",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Отваря формичката за ъпдейт на потребителя.",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Обновява потребителско име \"PeterNew\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Обновява парола \"654321\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Обновява имейл \"p1.1999@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Обновява име \"Peter\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Обновява фамилия \"Angelov\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Натиска върху бутона за запазване на промените в системата.",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Вижда, че информацията е обновена успешно \"Successfully Updated\".",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateSteps.openForm()"
});
formatter.result({
  "duration": 722400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PeterNew",
      "offset": 28
    }
  ],
  "location": "UpdateSteps.updateUsername(String)"
});
formatter.result({
  "duration": 97700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "654321",
      "offset": 17
    }
  ],
  "location": "UpdateSteps.updatePassword(String)"
});
formatter.result({
  "duration": 108900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "p1.1999@gmail.com",
      "offset": 16
    }
  ],
  "location": "UpdateSteps.updateEmail(String)"
});
formatter.result({
  "duration": 105600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter",
      "offset": 14
    }
  ],
  "location": "UpdateSteps.updateFistName(String)"
});
formatter.result({
  "duration": 80000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Angelov",
      "offset": 18
    }
  ],
  "location": "UpdateSteps.updateLastName(String)"
});
formatter.result({
  "duration": 94400,
  "status": "passed"
});
formatter.match({
  "location": "UpdateSteps.clickUpdateButton()"
});
formatter.result({
  "duration": 607000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully Updated",
      "offset": 43
    }
  ],
  "location": "UpdateSteps.showMessage(String)"
});
formatter.result({
  "duration": 106100,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Купуване на игра",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;купуване-на-игра",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "Отваря формичка за каталога с игри.",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "Натиска на Buy бутон на някаква игра, се взима самата игра и потребителското име на купувача \"Peter1\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Вижда съобщение \"Successfully bought game\".",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyGameSteps.openForm()"
});
formatter.result({
  "duration": 646200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter1",
      "offset": 94
    }
  ],
  "location": "BuyGameSteps.clickOnGameBuy(String)"
});
formatter.result({
  "duration": 579100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully bought game",
      "offset": 17
    }
  ],
  "location": "BuyGameSteps.showMessage(String)"
});
formatter.result({
  "duration": 63800,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Показване на купените игри на даден потребил",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;показване-на-купените-игри-на-даден-потребил",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "Отваря формичка на потребителя",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Натиска бутона покажи игри и се подава потребителско име \"Peter1\"",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "Вижда списък с игри ако има.",
  "keyword": "Then "
});
formatter.match({
  "location": "ShowBoughtGamesSteps.отваря_формичка_на_потребителя()"
});
formatter.result({
  "duration": 581400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter1",
      "offset": 58
    }
  ],
  "location": "ShowBoughtGamesSteps.натиска_бутона_покажи_игри_и_се_подава_потребителско_име(String)"
});
formatter.result({
  "duration": 599500,
  "status": "passed"
});
formatter.match({
  "location": "ShowBoughtGamesSteps.вижда_списък_с_игри_ако_има()"
});
formatter.result({
  "duration": 111000,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Купуване на абонамент",
  "description": "",
  "id": "основни-операции-на-платформа-за-игри;купуване-на-абонамент",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "Отваря формичка за абонаменти",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "Натиска бутона купи абонамент, се взима абонамента и потребителското име на купувача \"Peter1\"",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Вижда съобщение за успешно закупен абонамен \"Successfully bought subscription\".",
  "keyword": "Then "
});
formatter.match({
  "location": "BuySubscriptionSteps.отваря_формичка_за_абонаменти()"
});
formatter.result({
  "duration": 958700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter1",
      "offset": 86
    }
  ],
  "location": "BuySubscriptionSteps.натиска_бутона_купи_абонамент_се_взима_абонамента_и_потребителското_име_на_купувача(String)"
});
formatter.result({
  "duration": 897700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully bought subscription",
      "offset": 45
    }
  ],
  "location": "BuySubscriptionSteps.showMessage(String)"
});
formatter.result({
  "duration": 129100,
  "status": "passed"
});
});
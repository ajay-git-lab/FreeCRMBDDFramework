$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Personal Documents/Ajay/AjayEclipseWS/FreeCRMBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "navdusaj",
        "108270sony"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters deal details and save",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 10740279300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.tite_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 6364200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 136204400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3066404700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 5601200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1210220300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 1488119100,
  "status": "passed"
});
});
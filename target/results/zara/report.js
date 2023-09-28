$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/zara/loginEup.feature");
formatter.feature({
  "name": "Login EUP",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@login"
    },
    {
      "name": "@eup"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Unregistered email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negativeLogin"
    }
  ]
});
formatter.step({
  "name": "user access page \"https://usw-sandbox.dropmyemail.com/sign_in\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user input email \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click next",
  "keyword": "And "
});
formatter.step({
  "name": "user can see error message of unregistered email",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "\"hohoho@hohoho.com\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Unregistered email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@login"
    },
    {
      "name": "@eup"
    },
    {
      "name": "@negativeLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user access page \"https://usw-sandbox.dropmyemail.com/sign_in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.CommonSteps.user_access_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input email \"hohoho@hohoho.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Eup.LoginSteps.user_input_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click next",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Eup.LoginSteps.user_click_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see error message of unregistered email",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Eup.LoginSteps.user_can_see_error_message_of_unregistered_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
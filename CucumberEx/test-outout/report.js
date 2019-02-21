$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ksr02/eclipse-workspace/CucumberEx/src/test/java/test/features/CRMLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 21435606808,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_enters_username_and_password()"
});
formatter.result({
  "duration": 175238470,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 102417736,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 7261546,
  "status": "passed"
});
});
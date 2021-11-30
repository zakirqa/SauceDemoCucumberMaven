$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 4,
  "name": "login panel data testing",
  "description": "",
  "id": "login-panel-data-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "validating login with valid credentials",
  "description": "",
  "id": "login-panel-data-testing;validating-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on the loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be on the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_is_on_the_loginpage()"
});
formatter.result({
  "duration": 5480822200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enters_valid_username()"
});
formatter.result({
  "duration": 243546900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enters_valid_password()"
});
formatter.result({
  "duration": 134218800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 192216600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_be_on_the_homepage()"
});
formatter.result({
  "duration": 336305600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_able_to_close_the_browser()"
});
formatter.result({
  "duration": 814752600,
  "status": "passed"
});
});
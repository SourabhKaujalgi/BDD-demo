$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegitable",
  "description": "",
  "id": "search-and-place-order-for-vegitable",
  "keyword": "Feature"
});
formatter.before({
  "duration": 895300,
  "status": "passed"
});
formatter.before({
  "duration": 10116662200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for iterms and validate results",
  "description": "",
  "id": "search-and-place-order-for-vegitable;search-for-iterms-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Seleniumtest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Greencart Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Searched for \"Brocolli - 1 Kg\" Vagitables",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Brocoli\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Mystepdefination.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 607728100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocolli - 1 Kg",
      "offset": 19
    }
  ],
  "location": "Mystepdefination.user_searched_for_something_vagitables(String)"
});
formatter.result({
  "duration": 776603500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocoli",
      "offset": 1
    }
  ],
  "location": "Mystepdefination.something_should_be_displayed(String)"
});
formatter.result({
  "duration": 101658100,
  "status": "passed"
});
formatter.after({
  "duration": 470261500,
  "status": "passed"
});
formatter.after({
  "duration": 74600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Search for iterms and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Seleniumtest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on Greencart Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User Searched for \u003cName\u003e Vagitable",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "added items to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User proceed to checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "\u003cName\u003e should be displayed in check out page",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;",
  "rows": [
    {
      "cells": [
        "Name"
      ],
      "line": 18,
      "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;;1"
    },
    {
      "cells": [
        "Brocolli - 1 Kg"
      ],
      "line": 19,
      "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;;2"
    },
    {
      "cells": [
        "Brocolli - 1 Kg"
      ],
      "line": 20,
      "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 87900,
  "status": "passed"
});
formatter.before({
  "duration": 6952010100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search for iterms and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Seleniumtest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on Greencart Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User Searched for Brocolli - 1 Kg Vagitable",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "added items to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User proceed to checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Brocolli - 1 Kg should be displayed in check out page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Mystepdefination.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 10883200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocolli - 1 Kg",
      "offset": 18
    }
  ],
  "location": "Mystepdefination.user_searched_for_vagitable(String)"
});
formatter.result({
  "duration": 490578900,
  "status": "passed"
});
formatter.match({
  "location": "Mystepdefination.added_items_to_cart()"
});
formatter.result({
  "duration": 8716094600,
  "status": "passed"
});
formatter.match({
  "location": "Mystepdefination.user_proceed_to_checkout_page_for_purchase()"
});
formatter.result({
  "duration": 76400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocolli - 1 Kg",
      "offset": 0
    }
  ],
  "location": "Mystepdefination.should_be_displayed_in_check_out_page(String)"
});
formatter.result({
  "duration": 63026800,
  "status": "passed"
});
formatter.after({
  "duration": 319656600,
  "status": "passed"
});
formatter.after({
  "duration": 72700,
  "status": "passed"
});
formatter.before({
  "duration": 92300,
  "status": "passed"
});
formatter.before({
  "duration": 8365988100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search for iterms and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegitable;search-for-iterms-and-then-move-to-checkout-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Seleniumtest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on Greencart Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User Searched for Brocolli - 1 Kg Vagitable",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "added items to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User proceed to checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Brocolli - 1 Kg should be displayed in check out page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Mystepdefination.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 57045400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocolli - 1 Kg",
      "offset": 18
    }
  ],
  "location": "Mystepdefination.user_searched_for_vagitable(String)"
});
formatter.result({
  "duration": 961094700,
  "status": "passed"
});
formatter.match({
  "location": "Mystepdefination.added_items_to_cart()"
});
formatter.result({
  "duration": 8614376800,
  "status": "passed"
});
formatter.match({
  "location": "Mystepdefination.user_proceed_to_checkout_page_for_purchase()"
});
formatter.result({
  "duration": 91700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brocolli - 1 Kg",
      "offset": 0
    }
  ],
  "location": "Mystepdefination.should_be_displayed_in_check_out_page(String)"
});
formatter.result({
  "duration": 53371500,
  "status": "passed"
});
formatter.after({
  "duration": 172885700,
  "status": "passed"
});
formatter.after({
  "duration": 68300,
  "status": "passed"
});
});
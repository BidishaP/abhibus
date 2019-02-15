$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Ticket.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Booking bus ticket",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.step({
  "name": "I check for the in step \"\u003cFromNa\u003e\", \"\u003cToNa\u003e\", \"\u003cDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FromNa",
        "ToNa",
        "Date"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Banglore",
        "19-02-2019"
      ]
    },
    {
      "cells": [
        "Salem",
        "Chennai",
        "03-03-2019"
      ]
    },
    {
      "cells": [
        "Madurai",
        "chennai",
        "13-02-2019"
      ]
    },
    {
      "cells": [
        "Tirupur",
        "Coimbatur",
        "18-02-2019"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Booking bus ticket",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps1.i_want_to_write_a_step_with_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for the in step \"Chennai\", \"Banglore\", \"19-02-2019\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps1.i_check_for_the_in_step(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps1.i_verify_the_success_in_step()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking bus ticket",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps1.i_want_to_write_a_step_with_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for the in step \"Salem\", \"Chennai\", \"03-03-2019\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps1.i_check_for_the_in_step(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps1.i_verify_the_success_in_step()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking bus ticket",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps1.i_want_to_write_a_step_with_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for the in step \"Madurai\", \"chennai\", \"13-02-2019\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps1.i_check_for_the_in_step(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps1.i_verify_the_success_in_step()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking bus ticket",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Chrome failed to start: exited normally\n  (chrome not reachable)\n  (The process started from chrome location C:\\Users\\Bidisha\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe is no longer running, so ChromeDriver is assuming that Chrome has crashed.)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 9.85 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HP\u0027, ip: \u0027192.168.43.251\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepdefinition1.Hkoo1.beforeMethod(Hkoo1.java:14)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:40)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps1.i_want_to_write_a_step_with_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check for the in step \"Tirupur\", \"Coimbatur\", \"18-02-2019\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps1.i_check_for_the_in_step(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps1.i_verify_the_success_in_step()"
});
formatter.result({
  "status": "skipped"
});
});
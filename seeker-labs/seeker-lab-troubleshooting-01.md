# Seeker Hands-On Lab - Troubleshooting 01

*The learner will deploy the Seeker Agent only to find that the application no longer functions correctly. And do then do something about it!*

Please take the time to document your work as you go through this exercise by recording a few details, screen-captures, and key takeways.

This exercise builds on the same basic application as used in exercise seeker-lab-deployment-01. The only difference is that this time there will be a blocking issue during deployment that you will need to resolve.

## Step 1: Check Out

Switch to the branch for this lab:

`git checkout origin/seeker-lab-troubleshooting-01`

## Step 2: Local Build

You'll need to build the application you're going to be testing. Take a look at README.md if you haven't done so already.

* Build the front end.
* Build the Java back end.

## Step 3: Ensure The System Works WITHOUT Seeker

Ideally you would do this before any Seeker deployment! After all, if you add the Seeker Agent immediately and something doesn't work, how do you know whether Seeker caused the problem or not? Since we're in charge here, we're going to do things by the book.

### Step 3.1: Start The Application and Click Around

* Following the instructions in README.md, launch the application.
* Make sure you can see the front end on http://localhost:3001.
* Log in

If you can do all that: so far so good.

### Step 3.2: Make Sure The Tests Pass

Now follow the instructions in README.md to run the end-to-end test suite.

**The tests should pass!**

If they do, you're all set for the real work!

## Step 4: HippoTech Project Onboarding

Your mission is to on-board the HippoTech project (just the monolithic Java application for now). The high level plan is:

1. Create a project in Seeker.
1. Download and configure the appropriate Seeker agent for the application.
1. Restart the application-under-test with the Seeker agent attached.
1. Either the application or the tests appear to be broken. Troubleshoot and resolve.
1. Run the automated test suite and confirm that it is passing.

### Useful Resources

* Product Training: [Seeker: Configure Product Features](https://synopsys.skilljar.com/seeker-configure-project-features)

### Step 4.1: Create a Project

Create a project in your Seeker Server. 

### Step 4.2: Download Seeker Agent

Download the Seeker Agent binary. The simplest way to do this is to use the Connect Agent Wizard as described above. Follow the instructions on the screen.

### Step 4.3: Re-start Application-Under-Test with the Seeker Agent Attached

Carry on following the on-screen instructions. Once you have restarted the application-under-test you can quickly check a few things:

1. Navigate to Agents -> Connected Agents in the Seeker Server UI. You should check to make sure that the agent is detected and reporting to the correct project that you created in Step 4.1
1. **Important** - is the application-under-test still working correctly? Make sure the UI is up. Make sure you can still log in and comment on blog post, for example. If you can't do either of those things, and if you followed Step 3 correctly, the agent has probably broken the application-under-test and you will need to proceed to some troubleshooting.

In this case the application might look like it is up and running after your log in, because the front-end is still loaded. But you will find the functionality to be mostly broken: if you visit My Mortgages, it's empty. You won't find the blog entries and you won't be able to comment on them.

What's going on? 

### Step 4.4: Troubleshoot and Resolve

If the application is working and the tests are passing *without* Seeker, but not when the Seeker agent is attached, it looks pretty clear cut: Seeker is the problem. Ultimately, Seeker is instrumenting (i.e. modifying) the running code, so it is possible in some cases that these changes break the application full-stop. We want and need to know about this, so if this happens please collect the agent logs and raise a support ticket and/or ask for help on the #seeker Slack channel.

However, there are also occasions where the issue is not global or catestrophic, and you can test for some common issues yourself. This is the case here. The feature at fault is Active Verification. 

#### Active Verification

Active Verification is a great feature which can validate Seeker findings by sending one extra request to the application. However, if the application is not well protected against extra, unexpected requests, bad things can sometimes happen:

* The application may slow down noticely, and bad performance may even lead to a crash or unresponsive behaviour.
* The application may fail to load.
* Individual features such as forms or log-in may stop working.

If the Seeker Agent seems to be stopping the application from working properly, it is always worth checking to see whether Active Verification is the cause.

#### Active Verification Troubleshooting

##### Disabling Active Verification Completely

You can enable, disable, and configure Seeker project options by navigating to the project in the UI and selecting Features. The first, best course of action is disabling Active Verification completely and trying again. If the application starts working normally and tests start passing, you have found your issue. However, there may be a better solution than completely disabling this feature.

Go ahead and try it: does this solve the problem?

##### Disabling State-Changing Operations

Seeker attempts to distinguish between requests that will change the "state" of the application and those that are "safe". You can leave Active Verification enabled but disable state-changing operations by configuring Active Verification in the Seeker UI. Try it out: does this resolve the issue, or not in this case? If it does, it's a good option: you retain some Active Verification but don't break the application or the tests.

##### Configuring Active Verification Exceptions

By default, if enabled, Seeker will attempt Active Verification on any requests it can replay successfully. But you can tell it not to. Now, the tricky thing here is that understanding which requests need to be excluded requires a little debugging. If you can get the application logs it might be possible for us to search them for error messages or exceptions that give us a clue to the cause of the problem. In practice, this often requires some input from an engineer familiar with the application-under-test, and this won't always be possible. However, it is good to know that this option exists.

For extra credit, take a look at the application output and workout whether you can determine the cause of the issue and exclude the problematic request from Active Verification with an exception. You might also get some useful clues from the Endpoint Risk page in the Seeker UI for the product.

Consider this to be an optional task.

### Step 4.5: Re-run Tests and Check the Results

Once you have your final configuration, double-check you have a working deployment.

1. Is the application still working?
1. Do the tests still pass?
1. You should see vulnerabilities in the Seeker Project including Command Injection, Log4J etc.
1. You should see a minimal Data Flow Map for your project, including communications between the browser, the application, and the database, at least.
1. You should be able to use the Endpoint Risk page to view endpoints with vulnerabilities, endpoints that have been tested, and the list of endpoints that have *not* been tested using the on-screen filters.

*Document your work* take a note of the configuration you changed, and why.

## Conclusion 

* Active Verification can cause problems at runtime. If the application stops working, or if the tests stop passing after adding the Seeker agent, it is always the first thing to check.
* You can turn it off...but there are also some useful configuration options for reducing its aggressiveness, or excluding it from certain endpoints.

*Document your work* did you learn anything else during this exercise? Did you find anything more difficult than it should have been, or surprisingly easy? 
# Seeker Hands-On Lab - Deployment 01

*The learner will deploy the Seeker Agent for a simple, monolithic Java application and ensure that Seeker is functioning correctly.*

Please take the time to document your work as you go through this exercise by recording a few details, screen-captures, and key takeways.

## Step 1: Check Out

Switch to the branch for this lab:

`git checkout origin/seeker-lab-deployment-01`

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
1. Run the automated test suite.
1. Ensure that everything is working correctly.

### Useful Resources

* Creating Projects: [Seeker Project Templates and Project Creation](https://synopsys.skilljar.com/path/seeker-for-devops/seeker-project-templates-and-project-creation)
* Connecting Agents: [Attaching an Agent](https://synopsys.skilljar.com/path/seeker-for-devops/seeker-attaching-an-agent)
* Community Article: [Attaching an Agent and Getting Results](https://community.synopsys.com/s/article/Seeker-Attaching-an-Agent-and-Getting-Results)

### Important Notes 

*Don't forget the online help!* Once you get comfortable with Seeker you should be finding yourself using this as a reference more and more often. It's not perfect or complete, but it's pretty darn good. If you search for "Add a Project" you'll find a section, and that section leads to "Connect Agents Using Wizard" which is a pretty good next text.

*The UI has the definitive agent installation instructions!* If you want to know how to connect an agent to Node.js running on Azure Functions, for example, there is nowhere to look this up in the documentation. There are too many combinations of languages, platforms and variations such as serverless. Instead, go to Agents -> Connect Agent Wizard in the UI and use the Wizard to create tailored instructions for you and your technical environment.

### Step 4.1: Create a Project

Create a project in your Seeker Server. 

### Step 4.2: Download Seeker Agent

Download the Seeker Agent binary. The simplest way to do this is to use the Connect Agent Wizard as described above. Follow the instructions on the screen.

### Step 4.3: Re-start Application-Under-Test with the Seeker Agent Attached

Carry on following the on-screen instructions. Once you have restarted the application-under-test you can quickly check a few things:

1. Navigate to Agents -> Connected Agents in the Seeker Server UI. You should check to make sure that the agent is detected and reporting to the correct project that you created in Step 4.1
1. **Important** - is the application-under-test still working correctly? Make sure the UI is up. Make sure you can still log in. If you can't do either of those things, and if you followed Step 3 correctly, the agent has probably broken the application-under-test and you will need to proceed to some troubleshooting.

*Document your work* take a screen capture of the Connected Agents screen showing your newly connected agent.

### Step 4.4: Run the Automated Test Suite

1. Re-run the Cypress test suite to exercise the application-under-test.

### Step 4.5: Check the Results

1. Is the application still working?
1. Do the tests still pass?
1. You should see vulnerabilities in the Seeker Project including Command Injection, Log4J etc.
1. You should see a minimal Data Flow Map for your project, including communications between the browser, the application, and the database, at least.
1. You should be able to use the Endpoint Risk page to view endpoints with vulnerabilities, endpoints that have been tested, and the list of endpoints that have *not* been tested using the on-screen filters.

*Document your work* take a screenshot of a Critical or High impact finding discovered by Seeker.
*Document your work* do any of the untested endpoints look a bit worrying to you? Take a screenshot if so.

## Conclusion 

Hopefully you found that process to be fairly straightforward! The key takeways are:

* The Connect Agent Wizard is your go-to resource for agent installation instructions. Even if you end up automating the process later, this is the best place to get the key details for installing the agent for a specific combination of language, technology and platform.
* When the environment is simple, installing the Seeker agent is usually pretty simple. We'll get around to more complicated environments later in these exercises.
* Save yourself some headaches later by making sure that everything works *without* Seeker first! 

*Document your work* did you learn anything else during this exercise? Did you find anything more difficult than it should have been, or surprisingly easy? 
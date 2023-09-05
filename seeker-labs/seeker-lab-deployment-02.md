# Seeker Hands-On Lab - Deployment 02

*The learner will deploy the Seeker Agent for a microservices application using Java and Node.js and ensure that Seeker is functioning correctly.*

Please take the time to document your work as you go through this exercise by recording a few details, screen-captures, and key takeways.

## Step 1: Check Out

Switch to the branch for this lab:

`git checkout origin/seeker-lab-deployment-02`

You will need to make changes to the local filesystem to complete this exercise: that's what the branch is for!

## Step 2: Local Build

You'll need to build the application you're going to be testing. Take a look at README.md if you haven't done so already. In this case you'll be making use of the microservices version of HippoTech, using Docker-Compose. You can build the application with a single command:

`docker-compose build`

Make sure it works!

## Step 3: Ensure The System Works WITHOUT Seeker

Ideally you would do this before any Seeker deployment! After all, if you add the Seeker Agent immediately and something doesn't work, how do you know whether Seeker caused the problem or not? Since we're in charge here, we're going to do things by the book.

### Step 3.1: Start The Application and Click Around

* Following the instructions in README.md, launch the application (spoiler: `docker-compose up` should do it!).
* Make sure you can see the front end on http://localhost:3001.
* Log in

If you can do all that: so far so good.

### Step 3.2: Make Sure The Tests Pass

Now follow the instructions in README.md to run the end-to-end test suite. It doesn't matter whether you run the tests locally or with the Docker-Compose test file, they are the same tests.

**The tests should pass!**

If they do, you're all set for the real work!

## Step 4: HippoTech Microservices Project Onboarding

Your mission is to on-board the HippoTech microservices project (just the monolithic Java application for now). The high level plan is:

1. Create a Composite Project in Seeker. Composite Projects contain other projects, and the most common deployment model for distributed/microservices applications is to have one Composite Project that contains all the other, regular projects (one project per microservice). 
1. Create a Regular Project for each HippoTech microservice, and link it to the Composite Project.
1. Download and configure the appropriate Seeker agents for the different services.
1. Make the Seeker agent binaries available to the running application somehow.
1. Restart the application-under-test with the Seeker agents attached.
1. Run the automated test suite.
1. Ensure that everything is working correctly.

### Customer Requirements

Your (ficticious) customer has some clear requirements:

* They do not want the Seeker agent built into their container images.
* They would like to make any Seeker agent binaries availble to the running application via shared volumes.
* They would like you to make any necessary changes to the Docker Compose file(s) in the exercise branch and exlain what you did and why.

### A Note About Automatic Project Creation

Because you will need a separate project for each microservice, it could be tempting to use Seeker's automatic project creation feature. You should feel free to do this if you wish (consult the articles and documentation for more details) but don't feel like you have to, or that this feature is in some way required for testing microservices. It's a convenience feature that will be appropriate for some deployments, and not for others.

These instructions assume that you *won't* be using automatic project creation, but it's easy to do so if you wish. Or try it both ways!

### Useful Resources

* Community Article: [Composite Projects](https://community.synopsys.com/s/article/Seeker-Composite-Projects)
* Documentation: [Configure Automatic Project Creation in Composite Projects](https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=topics%2Ft_config_auto_projcreation_incomp.html&_LANG=enus)
* Documentation: [Deploying Seeker Agents with Docker](https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=topics%2Fr_wf_docker.html&_LANG=enus)

### Step 4.1: Create a Composite Project

Create a Composite Project in your Seeker Server for the HippoTech Microservices deployment.

### Step 4.2: Create Projects for the Microservices

Take a look at the docker-compose.yml file to get a feel for the individual "microservices" that make up this distributed application. You should see:

* hippotech (Java) - the React and API front end
* approval (Java) - a backend Java service
* blog (Node.js) - a backend Node.js service.

You may also notice other containers, such as MongoDB (which is used by the blog service). However, for a Seeker deployment we only care about containers where there is running code that we can instrument with the Seeker agent. In this case the blog service is running Node.js code that we do want to instrument...but there is nothing for us to do on the MongoDB container itself.

Go ahead and create regular projects for each of the individual services.

### Step 4.3: Add The Regular Projects to the Composite Project

If you create the regular projects first you can actually add them to the Composite Project when you create it. However, you may well need to adjust this list anyway as new services come online, so it's good to do it this way around as well.

Navigate to Projects -> Your Project -> Projects

This will be an initially empty list of all the regular Projects that make up your Composite Project. Find your three services and add them to the Composite Project.

### Step 4.4: Download Seeker Agents

Download the Seeker Agent binaries. The simplest way to do this is to use the Connect Agent Wizard and follow the instructions on the screen. However, you probably won't be able to follow *all* the instructions to the letter at this stage, because you're going to need to figure out how to get the binaries into the running containers at runtime. And Seeker doesn't have any specific instructions for Docker Compose!

### Step 4.5: Make the Seeker Agent Binaries Available to the Running Applications

As per your customer's requirements, you know you will need to modify the Docker Compose file(s) (e.g. docker-compose.yml) to complete the deploment. Since this is a Seeker tutorial and not a Docker Compose tutorial we'll spot you the syntax for making a local directory on your machine available to the running containers:

```
        volumes:
          - local/path:/path/on/container
```

Note that the Seeker documentation covers multiple techniques for adding the agent binaries to Docker environments:

* Using a bind mount to host the agent binary
* Buiding the agent binary into the image
* Downloading the agent binary from the Seeker server at runtime.

What you're doing in this exercise is closest to the first option, documented here: https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=topics%2Ft_wf_docker_mount.html&_LANG=enus

It's not the only way of doing it, not is the best way, but sometimes it's the right approach. You won't be able to follow these instructions to the letter because in this case you're using Docker Compose. But it's the same principles as covered in the docs:

* Documentation: [Deploying Seeker Agents with Docker](https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=topics%2Fr_wf_docker.html&_LANG=enus)

You'll just need to find the right way to do it in Docker Compose! You'll probably need to add a few environment variables to get the container runtimes to pick up the Seeker agents.

### Step 4.6: Re-start Application-Under-Test with the Seeker Agent Attached

Once you have added the Seeker agents to the three microservices you can restart the application under test:

`docker-compose restart`

Now it's time to see whether we have achieved our objectives or not!

1. Navigate to Agents -> Connected Agents in the Seeker Server UI. You should check to make sure that the 3 agents are detected and reporting to the correct projects that you created in Step 4.2
1. **Important** - is the application-under-test still working correctly? Make sure the UI is up. Make sure you can still log in. If you can't do either of those things, and if you followed Step 3 correctly, the agent has probably broken the application-under-test and you will need to proceed to some troubleshooting.

*Document your work* take a screen capture of the Connected Agents screen showing your newly connected agent.

### Step 4.7: Run the Automated Test Suite

1. Re-run the Cypress test suite to exercise the application-under-test.

### Step 4.8: Check The Results

1. Is the application still working?
1. Do the tests still pass?
1. You should see cross-project vulnerabilities in the Seeker Project. Use the "tags" filter on the vulnerabilities page to find them.
1. You should see a Data Flow Map for your project, including communications between all three microservices.
1. You should be able to use the Endpoint Risk page to view endpoints with vulnerabilities, endpoints that have been tested, and the list of endpoints that have *not* been tested using the on-screen filters.

*Document your work* take a screenshot of the Data Flow Map including all three microservices.
*Document your work* take a screenshot of the Data Flow tab of a Cross-Project vulnerability with dataflow across at least two microservices.

## Learning Points

* All the agent technologies are necessarily different: the techniques for instrumenting something as different as Node.js or Python code are completely different to Java, for example, where the notion of an agent is build into the runtime.
* If you know you need to deploy a Seeker agent on a new technology you haven't tried before the best advice is to try it out on some open source first.
* Distributed, or microservices architecture applications should be configured as Composite Projects in the Seeker Server.
* There are lots of different strategies for getting the Seeker agent into containerized applications. At the core it's just about getting the Seeker Server URL and the Project Key right, and this is often best done with environment variables so that the system-under-test behaves differently depending on what gets set.

*Document your work* did you learn anything else during this exercise? Did you find anything more difficult than it should have been, or surprisingly easy? 
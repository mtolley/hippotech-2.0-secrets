# Seeker Hands-On Labs

HippoTech can be used to practice Seeker deployment, configuration and troubleshooting. Each lab has its own branch. Pick the lab you want to work on from the list below and check it out (with Git):

`git checkout origin/seeker-lab-deployment-01`

These labs are designed to be useful for anyone learning to bring up Seeker with target applications, including Client Services Engineers, Sales Engineers, and indeed anyone with the word Engineer in their job title. 

## Reference Material and Tutorials

These exercises are hands-on labs and are not intended to replace the documentation or existing tutorials. Rather, they are an opportunity to practice and test your skills in a series of deployment scenarios based on real customer requirements.

* There are short courses available that cover most day-to-day deployment and configuration tasks here: https://synopsys.skilljar.com/page/seeker
* Once you have installed the Seeker Server the online help is easy to search and contains best practices guides in addition to reference material.
* The same documentation is also available online via the Synopsys Software Integrity Community: https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=m_intro.html&_LANG=enus

## Technical Prerequisites

### Local tools

Some of the labs require you to build and run the application-under-test locally. The easiest way to do this is to create a Linux VM running Ubuntu or similar, although in theory everything should work just as well on Windows. Note that you may experience challenges trying to run the deliberately insecure software included in these labs directly on Synopsys managed machines.

Building the application-under-test requires:

* JDK 11 or later
* Mave 3
* Node.js 14 or later

You will also need Docker and Docker Compose for the labs addressing microservices architecture deployments.

Instructions for building and running the application-under-test, HippoTech, can be found in `README.md` in the Git repository.

### Seeker Server

You will need an instance of the Seeker Server to complete these labs. You can install the Seeker Server on Windows, Linux, or MacOS (Intel only). Installing the Seeker Server for testing purposes is not particularly difficult but there is material on SkillJar and in the [documentation](https://community.synopsys.com/s/document-item?bundleId=seeker_guide&topicId=m_install.html&_LANG=enus) should you need it.

There is also a short Community [article](https://community.synopsys.com/s/article/Getting-Seeker-Server-Up-and-Running)

## The Labs

Each lab has a guide in this folder, with links below. Each lab is designed to be worked on in a separate branch, so the first thing you will do is switch to the specific branch for that lab (just follow the lab instructions).

All of the labs use a variant of the intentionally vulnerable application in this repository: HippoTech 2.0. For a full description of the application, how to build it, how to test it etc. see the [README](../README.md).

### [Seeker Deployment Lab #1](seeker-lab-deployment-01.md)

The learner will deploy the Seeker Agent for a simple, monolithic Java application and ensure that Seeker is functioning correctly.

### [Seeker Deployment Lab #2](seeker-lab-deployment-02.md)

The learner will deploy the Seeker Agent for a microservices application using Java and Node.js and ensure that Seeker is functioning correctly.

### [Seeker Troubleshooting Lab #1](seeker-lab-troubleshooting-01.md)

The learner will deploy the Seeker Agent only to find that the application no longer functions correctly.

### [Seeker Troubleshooting Lab #2 (not yet implemented)](seeker-troubleshooting-02.md)

The learner will deploy the Seeker Agent only to find that the end-user's tests no longer pass.

# Arquetipo Serenity BDD Screenplay

## Consideraciones
    - Proyecto con configuraciones en serenity.conf unicamente para chrome, debe modificarse si se desean capabilities de otros navegadores

## Name
Proyecto base de Serenity BDD con Screenplay

## Description
This project aims to establish a standard base for test automation with Srenity BDD and Screenplay


## ✅ Technologies
### This project required:
- [JDK java] version 16
- [Maven] version
- [Serenity] version
- [Cucumbre] version
- [JUnit] version

## Project status
<h4 align="center"> 🚧 Proyecto en construcción 🚧 </h4> 

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## 📁 Access to project

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/calidad_de_software/.../.git
git branch -M develop
git push -uf origin develop
```
##  🛠️ Run tests Chrome gradle:
```
gradle clean test -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test --info --stacktrace --tests "ruta.nameRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags @someTag" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags '@someTag or @someTag'" -Dcontext=chrome -Dwebdriver.driver=chrome
```
### ejemplo
```
gradle clean test --info --stacktrace --tests "co.com.pragma.runners.GoogleRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
```

##  🛠️ Run tests Firefox gradle:
```
gradle clean test -Dcontext=firefox -Dwebdriver.driver=firefox
gradle test --tests "co.com.pragma.runners.GoogleRunner" -Dcontext=firefox -Dwebdriver.driver=firefox
```
### ejemplo
```
gradle clean test --info --stacktrace --tests "co.com.pragma.runners.LoginRunner" -Dcontext=firefox -Dwebdriver.driver=firefox
```

cucumber.options might be cucumberOptions according to version

## **Run tests in different environments:**
```
gradle command... -Denvironment=defaul
gradle command... -Denvironment=dev
gradle command... -Denvironment=qa
gradle command... -Denvironment=prod
```
Note: 
- The default environment will be used if no other value is provided
- Could modify the environment urls in .../test/resources/serenity.conf

## ** 🛠️ Run after tests to generate report, If is necesary **
```
gradle serenity:aggregate
```

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Authors and acknowledgment

| [<img src="https://gitlab.com/uploads/-/system/user/avatar/13437423/avatar.png?width=400" width=115><br><sub>Mauro L. Ibarra P.</sub>](https://gitlab.com/mauro.ibarrap) <br/> | 
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|

## License
Open source project.


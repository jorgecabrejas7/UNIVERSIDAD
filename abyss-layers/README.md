
************************************************************************************

API Rest made to be deployed on Heroku PaaS and use Heroku Postgres DB

************************************************************************************

    - System.properties file contains version of wildfly server to be used on deployment by heroku wildfly buildpack

-----------------------------------------
Deployment instructions
-----------------------------------------
- Clone repository and copy abyss-layers directory
- After installing heroku cli and login in, create a new directory and inside it, create and clone an empty heroku app
- Copy abyss-layers into directory
- Execute the following commands:
    $ heroku buildpacks:clear
    $ heroku buildpacks:add heroku/java
    $ heroku buildpacks:add mterhart/wildfly
    $ git add .
    $ git commit -m ""
    $ git push heroku master
    $ heroku ps:scale web=1
- Rest API will be working under the url herokuUrl/abyss-layers-0.0.1-SNAPSHOT/routeToService

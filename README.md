# webappArchetype

Maven archetype for generating wep application

### Default dependencies

1. Apache Wicket 7
2. Spring 4
3. Hibernate + SQLite

### How to use

1. Clone project on your machine.
2. Open project directory in terminal
3. Run

        $ mvn clean install

4. Open parent project directory (~/MyProjects/ etc)
5. Run

        mvn archetype:generate \
            -DarchetypeCatalog=local \
            -DarchetypeGroupId=com.gfb \
            -DarchetypeArtifactId=webappArchetype \
            -DarchetypeVersion=1.0-SNAPSHOT \
            -DgroupId=com.example \
            -DartifactId=newAwesomeProject123

6. Open project directory

        cd newAwesomeProject123

7. Run script which install requirements

        bash bin/setup-local.sh

8. Now you can up server

        mvn clean package tomcat7:run

9. Open in browser

    http://localhost:8080/newAwesomeProject123/

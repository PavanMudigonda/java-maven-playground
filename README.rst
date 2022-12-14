Java Maven Starter
##################

Java, maven based playground starter project.

|ci| |codecov|

-----

.. contents::

.. section-numbering::

Features
========

test comment 

This starter includes:

* **Logback** - Console and rotating file logging - see `logback.xml`_
* **Junit 5 + hamcrest** - Testing frameworks
* **Executable jar creation** - See maven-shade-plugin plugin section in `pom.xml`_
* **Github actions CI with codecov template** - Basic github CI workflow with codecov report - see `.github/workflows/ci.yml`_
* **Basic maven profiles with parameter injection** - See `temp.properties`_ and `pom.xml`_
* **GitHub templates** - See `.github folder`_ and .md files in root folder
* **Code quality tools** - Checkstyle, PMD and SpotBugs configuration - see `pom.xml`_

Usage
=====

* Clone or download

Meta
====

Authors
-------

`yevgenykuz <https://github.com/yevgenykuz>`_

License
-------

`MIT License <https://github.com/yevgenykuz/java-maven-starter/blob/master/LICENSE>`_


-----

.. _`logback.xml`: https://github.com/yevgenykuz/java-maven-starter/blob/master/src/main/resources/logback.xml
.. _`pom.xml`: https://github.com/yevgenykuz/java-maven-starter/blob/master/pom.xml
.. _`.github/workflows/ci.yml`: https://github.com/yevgenykuz/java-maven-starter/blob/master/.github/workflows/ci.yml
.. _`temp.properties`: https://github.com/yevgenykuz/java-maven-starter/blob/master/src/main/resources/temp.properties
.. _`.github folder`: https://github.com/yevgenykuz/java-maven-starter/tree/master/.github

.. |ci| image:: https://github.com/yevgenykuz/java-maven-starter/workflows/All%20JDKs%20on%20all%20OSs/badge.svg
    :target: https://github.com/yevgenykuz/java-maven-starter/actions?query=workflow%3A%22All+JDKs+on+all+OSs%22
    :alt: Github CI

.. |codecov| image:: https://codecov.io/gh/yevgenykuz/java-maven-starter/branch/master/graph/badge.svg
    :target: https://codecov.io/gh/yevgenykuz/java-maven-starter/branch/master
    :alt: Test coverage

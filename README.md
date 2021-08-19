# trustly
Trustly Challenge 

* challenge1\api.html

    This page needs to be accessed via file or http, as the API service runs under http or https with an invalid certificate. 
    
    To use the HTTPS connection, it is necessary to ignore the certificate validation using some server side consumption
    and then making the data available in JSON again, in the same application domain.

    Without this additional step, unsafe connection warning may arise or the connection may be blocked by security policies in some browsers that prevent the use of crossdomain calls in these cases. The use of calls from different sources or protocols 
    requires additional configuration of the web server to allow this to happen

* challenge2\TrustlyChallenge2.java

    This application can be compiled with:
    javac TrustlyChallenge2.java

    And run with:
    java TrustlyChallenge2

    A Docker container can be installed with a JDK image, compile and run with
    these commands inside directory challenge2:
    
    docker build -t trustly-challenge-2 .
    docker run -it -p 8020:8020 --rm --name trustlychallenge trustly-challenge-2

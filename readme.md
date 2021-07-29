# how to deploy to openshift 4

- build
 mvn package oc:build oc:resource
 
- deploy 
 mvn oc:deploy 

- verify pods 
oc get pods -o wide -w

- verify service
oc describe service hello-today

- get route
oc get route hello-today 

- test 
curl http://route

# troubleshoot 
oc describe service hello-today 
 - make sure the  service has endpoint
 - make sure match port between application config and oc service
 
 
 


 
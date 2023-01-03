#!/bin/bash


ssh -i backend1 ubuntu@${1} "docker stop backend;docker rm backend;docker pull dingyi2000/backend;docker run -d --name=backend -p 8092:8092 -e DB_URL=jdbc:postgresql://${2}:5432/local_joi?currentSchema=joinews -e DB_PASSWORD=${3} dingyi2000/backend"
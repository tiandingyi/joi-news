# JOI News

## Requirement

- npm: 8.15.0+
- node: v16.17.0+
- jdk: jdk1.8
- gradle: 7.1+

## frontend

The frontend folder is `./web`, please see `./web/README.md` for more info.

## backend

The backend is implemented on Spring boot + Postgresql.

To run app locally you will need to run a postgresql database at port 5432 and ensure a database `local` exists. Please
find the configuration in `src/main/resources/application.yaml`. you can override it using custom env variables.

### build

run cmd below to build backend app. then you can find the artifact in `build/libs` folder.

`./gradlew build`

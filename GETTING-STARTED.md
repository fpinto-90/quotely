# Getting Started

## Prerequisite
- java 17

## Steps
1. run `./gradlew clean build`
2. run `java -jar build/libs/quotely-0.0.1.jar`

at this point the `shell:>` should be running and you can begin requesting quotes

you can type `help` to see available commands.

you can type `quote` to request quote with english as default.

you can type `quote --help` to see more options.

you can type `quote -l Russian` to request a quote in russian.

to quit the application just type `quit`.
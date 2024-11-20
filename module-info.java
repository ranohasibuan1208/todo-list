module TodoApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;

    opens todoapp;
    opens todoApp.entities;
    opens todoApp.repositories;
    opens todoApp.services;
    opens todoApp.views;
    opens todoApp.config;


}